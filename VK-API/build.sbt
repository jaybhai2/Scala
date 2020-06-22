
scalaVersion := "2.12.11"
// That is, to create a valid sbt build, all you've got to do is define the
// version of Scala you'd like your project to use.

// ============================================================================

// Lines like the above defining `scalaVersion` are called "settings". Settings
// are key/value pairs. In the case of `scalaVersion`, the key is "scalaVersion"
// and the value is "2.13.1"

// It's possible to define many kinds of settings, such as:

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

libraryDependencies += "org.asynchttpclient" % "async-http-client" % "2.10.0"
libraryDependencies += "commons-io" % "commons-io" % "2.6"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.10"
libraryDependencies += "commons-logging" % "commons-logging" % "1.2"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.6"
libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.10"
libraryDependencies += "org.apache.httpcomponents" % "httpcore" % "4.4.10"
libraryDependencies += "org.apache.httpcomponents" % "httpmime" % "4.5.10"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.11.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.11.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.11.0"
libraryDependencies += "joda-time" % "joda-time" % "2.10.6"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.13.0"
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.13.0"
libraryDependencies += "io.netty" % "netty-all" % "4.1.40.Final"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.8.0"
libraryDependencies += "com.typesafe.play" %% "play-functional" % "2.9.0"
libraryDependencies += "org.reactivestreams" % "reactive-streams" % "1.0.3"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.30"
libraryDependencies += "com.vk.api" % "sdk" % "1.0.6"


