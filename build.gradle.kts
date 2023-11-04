plugins {
	java
	idea

	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"

	id("com.coditory.integration-test") version "1.4.5"
}

group = "io.github.komidawi"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

idea {
	module {
		testSourceDirs.plusAssign(sourceSets["integration"].java.srcDirs)
		testResourceDirs.plusAssign(sourceSets["integration"].resources.srcDirs)
	}
}
