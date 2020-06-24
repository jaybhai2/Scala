### Set up sbt project for Eclipse IDE
## You need below base file structure 
```
project
  -src
    -main
      -code.scala
  -build.sbt
  -project
    plugins.sbt

```
```
build.sbt 
name := "scala100"
version := "1.0"
scalaVersion := "2.12.10" // check for latest version
publishMavenStyle := false

//%% means spark-core_scalaVersion, with single % you have to append _2.xx after spark-core
//libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.2" notTransitive ()

libraryDependencies +=  "org.apache.spark" %% "spark-core" % "2.4.2" notTransitive ()

EclipseKeys.withJavadoc := false
EclipseKeys.withSource := false

```
execute
```
sbt eclipse
```
if you change you build.sbt, just execute above command and refresh eclipse


## Open your plugin definition file (or create one if doesn't exist). You can use either:

the global file (for version 0.13 and up) at ~/.sbt/SBT_VERSION/plugins/plugins.sbt
the project-specific file at PROJECT_DIR/project/plugins.sbt
Add sbteclipse to the plugin definition file:

Version 6.x+ will only support SBT 1.0+ when it is released. Use 5.2.4 or older for previons versions of SBT
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
In sbt use the command eclipse to create Eclipse project files

> eclipse

In Eclipse use the Import Wizard to import Existing Projects into Workspace

```
STEP 1(Prereq): Install /Setup Software
Install Scala: http://www.scala-lang.org/download/
Install SBT: http://www.scala-sbt.org/download.html
Install Eclipse (/Scala IDE): http://scala-ide.org/download/sdk.html
Install Spark

STEP 2:
Create folder structure and add a build.sbt file
mkdir -p src/{main,test}/{java,resources,scala}
mkdir lib project target
touch build.sbt
touch project/plugins.sbt

Create plugins.sbt in project folder (for sbt eclipse and sbt assembly)
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

STEP 3:
Run sbt, sbt eclipse

STEP 4:
Import project into Workspace
Add code for Spark
```
