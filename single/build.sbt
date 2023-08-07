name := "scala-project-template"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.13.5"

libraryDependencies ++= Dependencies.sharedDependencies

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerBaseImage := Docker.java17