name := "scala-project-template"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.13.5"

lazy val sharedSettings = Seq(
  libraryDependencies ++= Dependencies.sharedDependencies
)

lazy val libsCommons = project.in(file("libs/scala-project-commons"))
  .enablePlugins(JavaAppPackaging)
  .settings(sharedSettings)

lazy val appsCore = project.in(file("apps/scala-project-core"))
  .enablePlugins(JavaAppPackaging)
  .settings(
    sharedSettings,
    libraryDependencies ++= Dependencies.appsCoreDependencies
  )
  .dependsOn(libsCommons)