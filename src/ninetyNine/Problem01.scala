def findLast[A](lst: List[A]): A = {
  lst match {
    case Nil     => throw new NoSuchElementException("no last of Nil")
    case List(h) => h
    case h :: t  => findLast(t)
  }
}

val lst1 = List(1, 1, 2, 3, 5, 8)
val lst2 = List(8)
val lst3 = Nil

assert(findLast(lst1) == 8)
assert(findLast(lst2) == 8)
try {
  findLast(lst3)
  assert(false)
}
catch {
    case _: NoSuchElementException =>
    case e => e.printStackTrace()
}
