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
### 4) add one to end of Array 
```
def add_one(arr:Array[Int]): Array[Int] = {

	var carry = 1
	
	var new_arr = new Array[Int](arr.length)
	
	var sum = 0
	
	for (i <- (arr.length-1 to 0 by -1) ){
		sum = arr(i) + carry
		
		if( sum == 10) 
			carry = 1
		else 
			carry = 0 
			
		new_arr(i) = sum % 10
		
	}
	if ( carry == 1) 
		{
		new_arr = new Array[Int](arr.length + 1)
		new_arr(0) = 1
		}
	
	
		return new_arr
}

add_one(Array(9,9,9))


```
