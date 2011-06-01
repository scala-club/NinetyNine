package ninetyNine

object Problem03 {
    
    //Find the Kth element of a list.
  def main(args : Array[String]) : Unit = {
      val list = (1 until 11).toList
      
      println("The 2nd element is " + kth(2, list))      
  }
  
  
  def kth(index: Int, list: List[Int]) : Int = {
      return findKth(index, list, 0)
  }
  
  def findKth(index: Int, list: List[Int], depth: Int): Int = {
      if(depth == index) return list.head
      else return findKth(index, list.tail, depth + 1)
  }
  
}