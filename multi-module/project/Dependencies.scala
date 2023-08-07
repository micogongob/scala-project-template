import sbt._

object Dependencies {
  val scalaTestVersion = "3.1.0"
  val scalaMockVersion = "5.2.0"

  val testDependencies: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
    "org.scalamock" %% "scalamock" % scalaMockVersion % Test
  )

  val sharedDependencies: Seq[ModuleID] = Seq() ++ testDependencies

  val libsCommonsDependencies: Seq[ModuleID] = Seq()
  val appsCoreDependencies: Seq[ModuleID] = Seq()
}