package com.example.app.model

class ApplicationInfo(val name: String, val version: String) {
  override def toString(): String = {
    return s"ApplicationInfo(name=$name,version=$version)"
  }
}