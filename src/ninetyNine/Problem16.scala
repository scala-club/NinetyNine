package ninetyNine

object Problem16 {

  def main(args: Array[String]): Unit = {
      println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def drop[A](n: Int, ls: List[A]): List[A] = {
      ls match {
          case Nil => Nil
          case m: List[A] => m.take(n - 1) ::: drop(n, m.drop(n))
      }
  }
}