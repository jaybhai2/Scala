import scala.io.Source

val lines = Source.fromFile("README.md").getLines.toList

val words = lines.flatMap( l => l.split("\\W+"))
				.map( word => word.trim.toUpperCase)
				.filterNot( word => word == "")

val words_count = words.groupBy( x=>x ).mapValues( v => v.size).toList

val words_count_sorted = words_count.sortWith( (x,y) => x._2 > y._2 )

words_count_sorted.take(3) foreach println
