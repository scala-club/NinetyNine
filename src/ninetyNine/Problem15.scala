package ninetyNine

object Problem15 {
  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
  
  def duplicateN[A](n: Int, ls: List[A]): List[A] = {
      return ls.flatMap(x => List.fill(n)(x))
  }
  
}