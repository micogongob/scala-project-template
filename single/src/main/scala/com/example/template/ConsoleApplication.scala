package com.example.template

import com.example.template.utils.ScalaProjectHelper

object ConsoleApplication {
  private var helper: ScalaProjectHelper = _

  helper = new ScalaProjectHelper()

  def main(args: Array[String]): Unit = {
    println("Starting ...")
    println(s"Info: ${helper.getContext()}")
    println("DONE")
  }

  def setHelper(helper: ScalaProjectHelper): Unit = {
    this.helper = helper
  }
}