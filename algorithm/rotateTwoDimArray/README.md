

     def rotateImage(a: Array[Array[Int]]): Array[Array[Int]] = {

      if (a.length == 1)
              a
          else
              a.transpose.map( arr => arr.reverse)
      }
