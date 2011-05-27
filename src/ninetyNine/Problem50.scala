import scala.math.Ordering
import scala.collection.mutable.PriorityQueue

object Problem50 {
  def huffman[A] (symbols : List[(A,Int)]) : List[(A,String)] = {
    var todo = new PriorityQueue()(Ordering[Int].on[(List[(A,String)], Int)](_._2).reverse)
    todo ++= symbols.map{case (a,w) => (List((a, "")), w)}

    while (todo.size >= 2) {
      val x = todo.dequeue()
      val y = todo.dequeue()

      todo += Pair(   x._1.map{ case (a, code) => (a, "0"+code) }
                   ++ y._1.map{ case (a, code) => (a, "1"+code) },
		   x._2 + y._2);
    }
    return todo.dequeue()._1;
  }

  def example = huffman[String](List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))
}
