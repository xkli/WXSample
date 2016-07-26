package com.weex.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

public class WPlugins implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.task("weex_build") << {
            println "Hello WEEX!"
        }
    }
}