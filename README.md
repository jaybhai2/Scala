# Scala
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
