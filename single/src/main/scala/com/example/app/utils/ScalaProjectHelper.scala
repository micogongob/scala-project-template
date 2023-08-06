package com.example.app.utils

import com.example.app.model.ApplicationInfo

class ScalaProjectHelper {
  def getAppInfo(): ApplicationInfo = {
    return ApplicationInfo("scala-project-template", "1.0.0")
  }
}