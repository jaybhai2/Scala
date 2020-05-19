### 1) mutateTheArray
```

def mutateTheArray(n: Int, a: Array[Int]): Array[Int] = {
    
    var new_arr:Array[Int] = new Array(n)

    if ( n == 1 ){
        return a
    }

    new_arr(0) = 0 + a(0) + a(1)

    new_arr(n-1) = a(n-1) + a(n-2)

    for( i <- 1 to n - 2 ){
        new_arr(i) = a(i-1) + a(i) + a(i+1)
    }

    return new_arr
}

```
### 2) Fibonacci
```
def fib(n:Int):Int={

if(n < 3)
  return 1
else
  return fib(n-1) + fib(n-2)

}

```
### 3) firstDuplicate
```
def firstDuplicate(a: Array[Int]): Int = {

    var mySet = scala.collection.mutable.Set[Int]()

    for( i <- a ){

        if (mySet.contains(i)){
            return i
        } 
        else
        {
            mySet += i 
        }
    }       
            return -1
}
```
