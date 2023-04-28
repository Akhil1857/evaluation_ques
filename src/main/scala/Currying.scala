object Currying extends App {

  private def sum(a: Int)(b: Int): Int = a + b


  private val increment = sum(1)(_)
  private val incrementedNumber = increment(5)
  println(incrementedNumber)

  private def nTimes(a: Int)(b: Int): Int = a * b

  private val times = nTimes(5)(_)
  private val twoTimes = times(2)
  private val threeTimes = times(3)
  println(twoTimes)
  println(threeTimes)



}
