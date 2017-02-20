name := "sandbox"

version := "0.1-SNAPSHOT"

organization := "com.igal"

scalaVersion in ThisBuild := "2.12.1"

val appDependencies = Seq()

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= appDependencies
  )

mainClass in assembly := Some("com.igal.Main")
