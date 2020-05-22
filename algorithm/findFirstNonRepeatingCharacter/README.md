

```
input:s: "abacabad"
Output:"c"



def firstNotRepeatingCharacter(s: String): Char = {

    val s_arr = s.toArray

    val distinct_arr = s_arr.groupBy( x=> x).mapValues( _.size).filter( tup => tup._2 == 1 ).map(tup => tup._1).toArray

    var firstChar = '_'

    for( i <- s_arr )  

        if (distinct_arr.contains(i)) 
    
             return i     
    return '_'
}


```
