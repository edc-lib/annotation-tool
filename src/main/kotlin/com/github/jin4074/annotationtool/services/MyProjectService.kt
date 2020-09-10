package com.github.jin4074.annotationtool.services

import com.intellij.openapi.project.Project
import com.github.jin4074.annotationtool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
