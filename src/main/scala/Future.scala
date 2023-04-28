import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt

object Futures extends App {


  private def stringConcatinate(firstString: String, secondString: String): Future[String] = Future(
    firstString + secondString
  )

  //  val result = stringConcatinate("A", "B").recover({
  //    case Exception => new IllegalArgumentException()
  //  })

  //stringConcatinate("A","B")
  private val stringAfterConcatination = stringConcatinate("A", "B").map(letter => letter + "A")
  val result = Await.result(stringAfterConcatination, 1.seconds)
  println(result)
  //println(resultAfterMap)

}
