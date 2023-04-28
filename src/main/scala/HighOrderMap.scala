object HighOrderMap extends App {

  val list = List(4,5,1,2,6)
  val incrementByOne = list.map(num => num + 1)

  val secondList = List(List(1,2,3,4,5))
  val afterFlatMap = secondList.flatMap(num => num.map(newNum => newNum+1))
  println(afterFlatMap)

  val evenList = list.filter(_ % 2==0)

  val forComprehensionResult = for{
    n1 <- secondList
  }yield n1.map(num => num +1 )

  val forEachResult = list.foreach(num => println(s"$num"))

}
