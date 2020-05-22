### right shift array , if left shift do:  a.tail.+:(a.head)

    def rotate( a:Array[Int], n:Int ): Array[Int] = {

      if(n ==0 )
        a
      else
        rotate(a.take( a.size - 1 ).+:(a.last) , n-1)

      }
