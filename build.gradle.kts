buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0-beta04")
        classpath(kotlin("gradle-plugin", version = "1.3.71"))
        classpath("com.google.gms:google-services:4.3.3")
        classpath("com.getkeepsafe.dexcount:dexcount-gradle-plugin:1.0.2")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.0.0-beta03")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}