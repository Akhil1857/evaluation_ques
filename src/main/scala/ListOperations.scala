import scala.annotation.tailrec

object ListOperations extends App {

  val list = List(1, 2, 3, 4, 5)
  val numberFromEnd = 2

  val reverseList = list.reverse
  //print(reverseList(numberFromEnd - 1))

  @tailrec
  private def nthElementExtract(list: List[Int], numberFromEnd: Int, index: Int): Int = {
    val newIndex = list.length - numberFromEnd
    if (newIndex == index) list(index)
    else nthElementExtract(list, numberFromEnd, index + 1)
  }

  println(nthElementExtract(list, 5, 0))

}
