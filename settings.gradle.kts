rootProject.name = "GradleTest"
include("Module1")
include("Module2")

dependencyResolutionManagement  {
    repositories {
        mavenCentral()
    }
}
