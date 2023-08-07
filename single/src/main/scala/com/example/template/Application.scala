package com.example.template

import com.example.template.utils.ScalaProjectHelper

object Application {
  private var helper: ScalaProjectHelper = _

  helper = new ScalaProjectHelper()

  def main(args: Array[String]): Unit = {
    println("Starting ...")
    println(s"App info: ${helper.getAppInfo()}")
    println("DONE")
  }

  def setHelper(helper: ScalaProjectHelper): Unit = {
    this.helper = helper
  }
}