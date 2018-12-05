import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.script



version = "2018.1"

project {

    buildType(RunTests)
}

object RunTests : BuildType({
    name = "run tests"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "hello world"
            enabled = false
            scriptContent = "echo hello world"
        }
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            mavenVersion = defaultProvidedVersion()
        }
    }
})
