scalaVersion := "2.11.12"

scalacOptions ++= Seq("-deprecation")

resolvers += Resolver.sonatypeRepo("releases")


libraryDependencies += "junit" % "junit" % "4.10" % Test
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0",
  "org.apache.spark" %% "spark-sql" % "2.1.0"
)


