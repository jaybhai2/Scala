## Function
```
def doSomething(func:String => Unit, s:String)  = func(s)
doSomething( x => println("apply function on "+x), "jahjah")

def iFactorial(n: Int): Int ={
      var i=n;
      var f=1;
      while (i>0){
        f = f*i;
        i = i-1;}
     return f;
}
def rFactorial(n: Int): Int = {
  if (n <= 0)
    return 1
  else
    return n * rFactorial(n - 1)
}
```
### Define function in a single statment
```
def myMax(x: Int, y: Int) = if (x > y) x else y
// assign function to a variable 
val f =(x: Int, y: Int) => if (x > y) x else y
```
### Placehoder syntax, _ means input argument, 2nd _ means second input argument, and so on
```
val r = 1 to 10
r.map(x => x + 10)
r.map( _ + 10 )

r.reduce( x * y)
r.reduce( _ * X)

r.filter( x=> x > 5)
r.filter( _ > 5 )
```
### Local function 
```
import scala.io.Source
import scala.io.Source._
def getErrors(fileName: String) = {
  def isError(line: String) = {
    if (line.contains("error")) true else false
  }
  val f = Source.fromFile(fileName)
  for (line <- f.getLines()) if isError(line) yield l
}
getErrors("/root/mylog.dat") foreach println
```
### Variable length Argument 
```
def ehco(s:String*) = s foreach println // * indicate argument can is array of string, to use this, must put array array arguement last
```

