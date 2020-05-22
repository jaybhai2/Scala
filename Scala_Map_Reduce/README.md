## Count words / find duplicate / find distinct  

val s = "Hello, this is mike from the white house. we have received a complaint about a chicken running on the street. Have you seen the chicken"

val words = s.split(" ")

val words_count = words.groupBy(x => x).mapValues( _.size)

val unique_words_count = words_count.filter( tup => tup._2 == 1)

val unique_words = unique_words_count.map( _._1 )

unique_words: scala.collection.immutable.Iterable[String] =
List(this, have, is, seen, running, house., street., Have, you, on, Hello,, from, complaint, about, mike, we, white, received)
