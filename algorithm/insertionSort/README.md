 ```
 def insertionSort(xs: List[Int]): List[Int] = {
 
  def insert(y: Int, ys: List[Int]): List[Int] =
    ys match {
      case List() => y :: List()
      case z :: zs =>
        if (y < z) y :: z :: zs
        else z :: insert(y, zs)
    }

  xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys))
  }
}

```
 
 
 
 ```
 def insertionSort(xs: List[Int]): List[Int] = xs match {
      case List() => List()
      case y :: ys => insert(y, insertionSort(ys))
    }

    val cond: (Int, Int) => Boolean = (x,y) => x < y

    def insert(x: Int, xs: List[Int]): List[Int] =
      xs match {
        case List() => x :: 
    Nil

        case y :: ys =>
          if (cond(x, y)) x :: y :: ys
          else y :: insert(x, ys)
      }
    insert(2, 1 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(1, 2 :: 3 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
    insert(3, 1 :: 2 :: Nil) shouldBe (1 :: 2 :: 3 :: Nil)
```
