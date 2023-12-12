plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.7.1")
    testImplementation("io.rest-assured:rest-assured:5.3.2")
    testImplementation("io.rest-assured:json-schema-validator:5.3.0")
    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.json:json:20230227")
    testImplementation("org.apache.httpcomponents:httpclient:4.5")

}


tasks.named<Test>("test") {
    // Use TestNG for unit tests.
    useTestNG()
}