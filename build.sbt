

lazy val root = (project in file(".")).enablePlugins(PlayScala).settings(
  scalaVersion := "2.11.4",
  scalacOptions in Compile ++= Seq("-Ywarn-unused-import")
)
