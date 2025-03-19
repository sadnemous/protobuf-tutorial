import xml.etree.ElementTree as ET

POM_FILE = "pom.xml"
BUILD_GRADLE_FILE = "build.gradle.kts"
SETTINGS_GRADLE_FILE = "settings.gradle.kts"

def parse_pom(pom_file):
    tree = ET.parse(pom_file)
    root = tree.getroot()
    
    namespaces = {'maven': 'http://maven.apache.org/POM/4.0.0'}
    
    group_id = root.find("maven:groupId", namespaces) or root.find("maven:parent/maven:groupId", namespaces)
    artifact_id = root.find("maven:artifactId", namespaces)
    version = root.find("maven:version", namespaces) or root.find("maven:parent/maven:version", namespaces)
    
    dependencies = root.find("maven:dependencies", namespaces)
    dependency_list = []
    if dependencies:
        for dep in dependencies.findall("maven:dependency", namespaces):
            dep_group = dep.find("maven:groupId", namespaces).text
            dep_artifact = dep.find("maven:artifactId", namespaces).text
            dep_version = dep.find("maven:version", namespaces)
            dep_version_text = dep_version.text if dep_version is not None else ""
            dependency_list.append((dep_group, dep_artifact, dep_version_text))
    
    return {
        "group_id": group_id.text if group_id is not None else "",
        "artifact_id": artifact_id.text if artifact_id is not None else "",
        "version": version.text if version is not None else "",
        "dependencies": dependency_list,
    }

def generate_build_gradle_kts(pom_data):
    dependencies_block = "".join([
        f"    implementation(\"{group}:{artifact}:{version}\")\n" if version else f"    implementation(\"{group}:{artifact}\")\n"
        for group, artifact, version in pom_data["dependencies"]
    ])
    
    build_gradle_kts_content = f'''
kotlin {{
    jvm()
}}

group = "{pom_data["group_id"]}"
version = "{pom_data["version"]}"

repositories {{
    mavenCentral()
}}

dependencies {{
{dependencies_block}}}
'''
    
    with open(BUILD_GRADLE_FILE, "w") as f:
        f.write(build_gradle_kts_content)

def generate_settings_gradle_kts(pom_data):
    settings_gradle_kts_content = f'rootProject.name = "{pom_data["artifact_id"]}"\n'
    with open(SETTINGS_GRADLE_FILE, "w") as f:
        f.write(settings_gradle_kts_content)

def main():
    pom_data = parse_pom(POM_FILE)
    generate_build_gradle_kts(pom_data)
    generate_settings_gradle_kts(pom_data)
    print("Conversion completed. Generated build.gradle.kts and settings.gradle.kts.")

if __name__ == "__main__":
    main()

