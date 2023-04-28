object HOFTest extends App{
  def product(f: Int, number: Int): Int = {
    increment(5) * number

  }

  def increment(digit: Int): Int = {
    digit + 1
  }

  product(5)

}
