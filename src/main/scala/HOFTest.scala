object HOFTest extends App{
  private def product(f:Int=>Int, number: Int): Int = {
    val resultIncrement = f(5)
    resultIncrement * number

  }

  private def increment(digit: Int): Int = {
    digit + 1
  }

 private val result =  product(increment,5)
  println(result)

}


