package com.example.template.utils

import com.example.template.model.ApplicationInfo

class ScalaProjectHelper {
  def getAppInfo(): ApplicationInfo = {
    return ApplicationInfo("scala-project-template", "1.0.0")
  }
}