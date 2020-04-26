enablePlugins(ScalaJSPlugin)
// enablePlugins(JSDependenciesPlugin)
// enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js OpenGL"
scalaVersion := "2.13.1"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

scalaJSUseMainModuleInitializer := true

