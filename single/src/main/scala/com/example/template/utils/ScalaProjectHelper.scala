package com.example.template.utils

import com.example.template.model.Context

class ScalaProjectHelper {
  def getContext(): Context = {
    return Context("scala-project-template", "1.0.0")
  }
}