name := "todobackend-scala-springboot"

version := "1.0"

scalaVersion := "2.12.1"


libraryDependencies ++= Seq(
  "org.springframework.boot"  % "spring-boot-starter-web"   % "1.5.1.RELEASE",
  "org.springframework.boot"  % "spring-boot-starter-test"  % "1.5.1.RELEASE"   % Test,
  "org.scalatest"             % "scalatest_2.12"            % "3.0.1",
  "junit"                     % "junit"                     % "4.12"            % Test
)