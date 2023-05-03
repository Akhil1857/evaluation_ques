import scala.annotation.tailrec

object firstRepeatedOccurence extends App {

  private def findRepeated(word: String): Char = {

    @tailrec
    def repeat(remaining: List[Char], seen: List[Char]): Char = {
      remaining match {
        case head :: tail =>
          if (seen.contains(head)) head
          else repeat(tail, seen :+ head)
        case _ => 1.toChar

      }
    }
      repeat(word.toList, List.empty[Char])

  }
println(findRepeated("abcdda"))
}
