

     def rotateImage(a: Array[Array[Int]]): Array[Array[Int]] = {

      if (a.length == 1)
              a
          else
              a.transpose.map( arr => arr.reverse)
      }


     Rotate by +90:

     Transpose
     Reverse each row
     Rotate by -90:

     Method 1 :

     Transpose
     Reverse each column
     Method 2 :

     Reverse each row
     Transpose
     Rotate by +180:

     Method 1: Rotate by +90 twice

     Method 2: Reverse each row and then reverse each column (Transpose)

     Rotate by -180:

     Method 1: Rotate by -90 twice

     Method 2: Reverse each column and then reverse each row

     Method 3: Rotate by +180 as they are same
