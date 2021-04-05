import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm")
}

java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {

}

tasks {
	withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
	}

	processResources {
		dependsOn(":ui:browserWebpack")
		from(project(":ui").projectDir.resolve("src/main/resources")) {
			into("static/actuator/ui")
		}
		from(project(":ui").buildDir.resolve("distributions/actuator-ui.js"))  {
			into("static/actuator/ui")
		}
	}
}