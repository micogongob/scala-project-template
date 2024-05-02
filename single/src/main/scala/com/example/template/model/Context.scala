package com.example.template.model

case class Context(val greeting: String, val target: String) {
  override def toString(): String = {
    return s"Context(greeting=$greeting,target=$target)"
  }
}

