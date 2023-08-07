package com.example.template.utils

import com.example.template.model.Context

class ScalaProjectHelper {
  def getContext(): Context = {
    val greeting = sys.env.getOrElse("GREETING", "Hello")
    val target = sys.env.getOrElse("TARGET", "World")
    return Context(greeting, target)
  }
}