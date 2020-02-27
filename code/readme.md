def iFactorial(n: Int): Int ={
      var i=n;
      var f=1;
      while (i>0){
        f = f*i;
        i = i-1;
        }
     return f;
}


def rFactorial(n: Int): Int = {
  if (n <= 0)
    return 1
  else
    return n * rFactorial(n - 1)
}
