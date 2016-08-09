
name := "b"
version := "0.1.0-SNAPSHOT"
organization := "com.example"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.example" %% "a" % "0.1.0-SNAPSHOT" % "compile->compile;test->test"
)
