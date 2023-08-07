package com.example.template.commons.utils

import com.example.template.commons.model.ApplicationInfo

class ScalaProjectHelper {
  def getAppInfo(): ApplicationInfo = {
    return ApplicationInfo("scala-project-template", "1.0.0")
  }
}