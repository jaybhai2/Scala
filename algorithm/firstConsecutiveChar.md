```

  def consecutiveChar(chars:List[Char]): String ={
    
    chars match  {
      case Nil => "Not found"
      case List(a,b,_*) if a == b => "Found two consecutive character : " + a
      case h :: t => consecutiveChar(t)
    }
    
  }
  
  
  println(consecutiveChar("abccdd".toList))
  
  Found two consecutive character : c


```
