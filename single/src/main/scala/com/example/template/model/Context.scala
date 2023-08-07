package com.example.template.model

class Context(val name: String, val version: String) {
  override def toString(): String = {
    return s"Context(name=$name,version=$version)"
  }
}

object Context {
  def apply(name: String, version: String): Context = {
    return new Context(name, version)
  }
}