package com.example.template.core

import com.example.template.commons.utils.ScalaProjectHelper

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