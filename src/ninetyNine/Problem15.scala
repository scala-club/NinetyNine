package ninetyNine

object Problem15 {
  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
  
  def duplicateN[A](n: Int, ls: List[A]): List[A] = {
      return ls.flatMap(x => listify(n, x))
  }
  
  def listify[A](n: Int, x: A): List[A] = {
      var ls = List[A]()
      for (i <- (0 until n)) {
          ls = x :: ls
      }
      return ls
  }
  
}