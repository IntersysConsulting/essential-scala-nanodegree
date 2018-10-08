import Dependencies._
import microsites._

enablePlugins(MicrositesPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.intersyscosulting",
      scalaVersion := "2.12.7",
      version      := "0.0.0-SNAPSHOT"
    )),
    name := "scala-essentials",
    micrositeName := "Scala Essentials",
    micrositeDescription      := "Scala Essentials Nanodegree",
    micrositeBaseUrl          := "/scala-essentials",
    micrositeDocumentationUrl := "/scala-essentials/docs.html",
    micrositeAuthor           := "Intersys Consulting" ,
    micrositeHomepage         := "https://intersysconsulting.github.io/scala-essentials",
    micrositeGithubOwner      := "intersysconsulting",
    micrositeGithubRepo       := "essential-scala-nanodegree",
    micrositeGitterChannel    := false,
    micrositeHighlightLanguages ++= Seq("haskell", "fsharp", "scala", "python", "java"),
    micrositeCDNDirectives    := CdnDirectives(
      jsList = List(
        "https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.5/MathJax.js?config=TeX-MML-AM_CHTML,https://oscarvarto.github.io/learning-scala/js/mathjax-config.js"
      )
    ),
    libraryDependencies += scalaTest % Test
  )