name := "scala-project-template"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.13.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
// TODO fix scalamock not found
// libraryDependencies += "org.scalamock" %% "scalamock" % "4.0.0" % Test

enablePlugins(JavaAppPackaging)