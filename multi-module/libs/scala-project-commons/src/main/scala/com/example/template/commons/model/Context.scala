package com.example.template.commons.model

class Context(val greeting: String, val target: String) {
  override def toString(): String = {
    return s"Context(greeting=$greeting,target=$target)"
  }
}

object Context {
  def apply(greeting: String, target: String): Context = {
    return new Context(greeting, target)
  }
}