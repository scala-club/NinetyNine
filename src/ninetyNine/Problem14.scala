package ninetyNine

object Problem14 {
  def main(args: Array[String]): Unit = {
      println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }
  
  def duplicate[A](ls: List[A]): List[A] = {
      return ls.flatMap(x => List(x, x))
  }
}