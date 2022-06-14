package com.github.remiperuto.standardjitjetbrains.services

import com.intellij.openapi.project.Project
import com.github.remiperuto.standardjitjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
