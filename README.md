# Scala

## Build
# to clean and build the jar
```
mvn clean package
mvn clean package -Dtest=MyTestClass1
```


# to clean, build jar and install jar in local .m2 repo
```
mvn clean install
```
# to source from local repo in pom.xml
```
<repositories>
  <repositor>
    <id>mylocal-repo</id>
    <url>file://Users/jwei/.m2/repository/</url>
```

# to to dependency tree (how pom source dependency)
```
mvn dependency:tree
```

# to print out what scope are omitted
```
mvn dependency:tree -Dverbose
```


## for scala REPL, run sbt console
with sbt console, sbt will aslo pull all class in the project directory to your REPL session.
try to create a class in test.scala
```
class employee{
  val name = "jay";
  val age = 36;
}
```
then run sbt console, 
```
scala> val emp = new employee
emp: employee = employee@3752b4f2
scala> println(emp.name)
jay
scala> println(emp.age)
36
```
in you wish to import some library in REPL, such as import org.apache.spark.SparkContext

exit REPL, and start sbt, 
```
set libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "2.0.2"  
show libraryDependencies
session save
```
or just put it in a build.sbt file then console will pull the dependency 

### 1)sbt file structure
_______________________________________________________________________________________________________________
![Image1](https://github.com/jayjayjohn/Scala/blob/master/im/sbt_structure.PNG)

### 2) after 'sbt package' below two folder will be created
_______________________________________________________________________________________________________________
![Image2](https://github.com/jayjayjohn/Scala/blob/master/im/sbt_structure2.PNG)

### 3) build.sbt format 
_______________________________________________________________________________________________________________
![Image2](https://github.com/jayjayjohn/Scala/blob/master/im/sbt_structure3.PNG)

### 4) to reload dependencies
_______________________________________________________________________________________________________________
![Image2](https://github.com/jayjayjohn/Scala/blob/master/im/sbt_structure4.PNG)
