import sbt._
import Keys._

object Settings {
  lazy val all = Seq(
    libraryDependencies ++= Seq(
      "org.webjars" %% "webjars-play" % "2.2.1-2"
      , "org.webjars" % "angularjs" % "$webjar_angular$"
      , "org.webjars" % "bootstrap" % "$webjar_bootstrap$"
      , "org.webjars" % "angular-ui-bootstrap" % "$webjar_angular_ui$"
    )
  )
}