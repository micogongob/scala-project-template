package com.example.template.commons.utils

import com.example.template.commons.model.Context

class ScalaProjectHelper {
  def getContext(): Context = {
    return Context("scala-project-template", "1.0.0")
  }
}