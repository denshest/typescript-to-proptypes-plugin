package com.github.denshest.typescripttoproptypesplugin.services

import com.intellij.openapi.project.Project
import com.github.denshest.typescripttoproptypesplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
