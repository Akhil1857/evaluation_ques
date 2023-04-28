object PartialFunction extends App {

  private def partialFunction(field: List[Int]): List[Int] = {
    field.filter(_ % 2 == 0)
  }

  val list = List(1, 2, 3, 4, 5, 6)
  val result = partialFunction(list)

}
