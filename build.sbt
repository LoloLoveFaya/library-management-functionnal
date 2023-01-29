ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "library-management-functionnal"
  )

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fansi" % "0.4.0",
  "org.scalatest" %% "scalatest" % "3.2.13" % Test
)