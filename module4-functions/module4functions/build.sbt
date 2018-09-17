import Dependencies._

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")

enablePlugins(TutPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.intersysconsulting",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Module4Functions",
    libraryDependencies += scalaTest % Test
  )
