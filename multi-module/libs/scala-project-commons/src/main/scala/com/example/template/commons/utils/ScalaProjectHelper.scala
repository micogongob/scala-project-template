package com.example.template.commons.utils

import com.example.template.commons.model.Context

class ScalaProjectHelper {
  def getContext(): Context = {
    val greeting = sys.env.getOrElse("GREETING", "Hello")
    val target = sys.env.getOrElse("TARGET", "World")
    return Context(greeting, target)
  }
}