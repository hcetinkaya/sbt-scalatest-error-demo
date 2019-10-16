name := "sbt-getting-started"
version := "0.1"

scalaVersion := "2.13.1"

lazy val root = project.in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.8" % Test
    )
)
