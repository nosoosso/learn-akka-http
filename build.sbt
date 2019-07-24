name := "learn-akka-http"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-Ypartial-unification"

val circeVersion = "0.11.1"
libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0-M1",

  "com.typesafe.akka" %% "akka-actor" % "2.5.23",
  "com.typesafe.akka" %% "akka-stream" % "2.5.23",
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "de.heikoseeberger" %% "akka-http-circe" % "1.27.0",

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion
)