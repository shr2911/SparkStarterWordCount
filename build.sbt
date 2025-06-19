name:= "SparkStarterWordCount"

version := "0.1"

scalaVersion := "2.13.8"

//lazy val root = (project in file("."))
//  .settings(
//    name := "SparkStarterWordCount"
//  )

libraryDependencies++=Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1",
  "org.apache.spark" %% "spark-sql" % "3.5.1",
  "com.typesafe" % "config" % "1.4.2"
)

