name := "sandbox"

version := "0.1-SNAPSHOT"

organization := "com.igal"

scalaVersion in ThisBuild := "2.12.1"

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.8" % "test")

  )

mainClass in assembly := Some("com.igal.Main")

scalacOptions in Test ++= Seq ("-Yrangepos")
