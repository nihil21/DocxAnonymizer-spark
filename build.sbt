name := "DocxAnonymizer"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.14"

val sparkVersion = "3.1.2"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

scalacOptions := Seq("-target:jvm-1.8")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.12" % sparkVersion,
  "org.docx4j" % "docx4j" % "6.1.2",
  "commons-cli" % "commons-cli" % "1.2",
  "com.amazonaws" % "aws-java-sdk" % "1.11.775"
)
