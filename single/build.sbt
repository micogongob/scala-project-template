name := "scala-project-template"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.13.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test
libraryDependencies += "org.scalamock" %% "scalamock" % "5.2.0" % Test

enablePlugins(JavaAppPackaging)