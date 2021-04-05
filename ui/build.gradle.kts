import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("js")
}

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
    maven(url = "https://dl.bintray.com/subroh0508/maven")
}

kotlin {
    js {
        useCommonJs()
        binaries.executable()

        browser {
            runTask {
                sourceMaps = true
                devServer = KotlinWebpackConfig.DevServer(
                    port = 8090,
                    contentBase = listOf("${projectDir.path}/src/main/resources")
                )
                outputFileName = "actuator-ui.js"
            }

            webpackTask {
                outputFileName = "actuator-ui.js"
            }
        }
    }
}

dependencies {

    implementation("org.jetbrains:kotlin-react:17.0.1-pre.148-kotlin-1.4.30")
    implementation(npm("react", "17.0.1"))

    implementation("org.jetbrains:kotlin-react-dom:17.0.1-pre.148-kotlin-1.4.30")
    implementation(npm("react-dom", "17.0.1"))

    implementation("org.jetbrains:kotlin-redux:4.0.5-pre.148-kotlin-1.4.30")
    implementation(npm("redux", "4.0.5"))

    api("net.subroh0508.kotlinmaterialui:core:0.5.5")

}

// Heroku Deployment (chapter 9)
tasks.register("stage") {
    dependsOn("build")
}