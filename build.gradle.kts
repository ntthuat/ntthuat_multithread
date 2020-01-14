import org.gradle.api.tasks.testing.logging.TestExceptionFormat

group = "com.ntthuat.multithread"

extra["spring.version"] = "5.1.3.RELEASE"
extra["spring.boot.version"] = "2.1.6.RELEASE"
extra["spring.cloud.version"] = "Greenwich.RC2"

plugins {
    java
    idea
    id("org.springframework.boot") version "2.1.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    jacoco
    id("org.sonarqube") version "2.6.2"
    id("io.franzbecker.gradle-lombok") version "3.1.0"
}

repositories {
    jcenter()
    maven("https://repo.spring.io/milestone")
    maven("https://dl.bintray.com/americanexpress/maven/")
}

dependencies {
    implementation(enforcedPlatform("org.springframework.cloud:spring-cloud-dependencies:${extra["spring.cloud.version"]}"))
    implementation("javax.inject:javax.inject:1")
    implementation("com.google.guava:guava:26.0-jre")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("io.jsonwebtoken:jjwt:0.9.0")

    implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

    implementation("org.flywaydb:flyway-core")
    implementation("org.postgresql:postgresql")

    compile("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    compile("org.mapstruct:mapstruct:1.3.0.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.0.Final")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
    }

    compileOnly("uk.co.jemos.podam:podam:7.2.1.RELEASE")
    compileOnly("com.github.javafaker:javafaker:0.17.2")

    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.21.0")
    testImplementation("com.h2database:h2")
}

tasks {
    
    compileJava {
        options.compilerArgs.addAll(listOf(
                "-Amapstruct.defaultComponentModel=jsr330"
        ))
    }

    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
            showExceptions = true
            showCauses = true
            exceptionFormat = TestExceptionFormat.FULL
        }
    }
}
