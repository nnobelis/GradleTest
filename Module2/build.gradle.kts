plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"


dependencies {
    implementation(project(":Module1"))
}
