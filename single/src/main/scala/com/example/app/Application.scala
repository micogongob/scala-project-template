package com.example.app

import com.example.app.utils.ScalaProjectHelper

object Application {

  def main(args: Array[String]): Unit = {
    val helper = new ScalaProjectHelper()
    println("Starting ...")
    println(s"App info: ${helper.getAppInfo()}")
    println("DONE")
  }

}