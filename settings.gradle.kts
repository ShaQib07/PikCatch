pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PikCatch"
include(":app")
include(":core")
include(":feature")
include(":core:designsystem")
include(":core:ui")
include(":core:common")
include(":core:network")
include(":core:data")
include(":core:testing")
include(":core:datastore")
include(":core:database")
include(":core:model")
