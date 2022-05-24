package com.github.gimazovbulat.idk.services

import com.intellij.openapi.project.Project
import com.github.gimazovbulat.idk.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
