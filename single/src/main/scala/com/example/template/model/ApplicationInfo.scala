package com.example.template.model

class ApplicationInfo(val name: String, val version: String) {
  override def toString(): String = {
    return s"ApplicationInfo(name=$name,version=$version)"
  }
}

object ApplicationInfo {
  def apply(name: String, version: String): ApplicationInfo = {
    return new ApplicationInfo(name, version)
  }
}