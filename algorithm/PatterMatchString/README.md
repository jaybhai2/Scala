    package test
    object scalaRun {
    import util.control.Breaks._

    def main(args: Array[String]): Unit = {

      val str = "amazingamazing"
      val pat = "010"
      func(pat,str)

    }

    def func(pat:String , str:String):Unit={

      val vowels = Array('a','e','i','o','u')

      var state = true

      var current_state = false

      var count  = 0
                //0 - 7-(3) =4
      for(i <- (0 to str.length - ( pat.length  ) ) ){

        state = true
        println("loop :" + i.toString)

      breakable {
        for( pi <- ( 0 to pat.length -1 ) ){

          val checkIndex = i + pi 

          current_state =  pat(pi) match {
            case '0' =>  vowels.contains(str(checkIndex))
            case '1' => !vowels.contains(str(checkIndex))
          }

          print(current_state + " ")
          state = state & current_state

          if( current_state == false ) break
        }
        }

        if(state == true) count += 1  
        println("\tcount = " + count.toString)

      }
    }
   }
