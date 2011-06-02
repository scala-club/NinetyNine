import scala.annotation.tailrec

object Problem49 {
	def step(old : List[String]) =
		(old        map {"0" + _}) ++
		(old reverseMap {"1" + _})

	// the simplest one, I think: a recursive definition
	def grayRec(n : Int) : List[String] =
		if(n < 1) List("")
		else step(grayRec(n-1))

	// as discussed in scala club, a tail-recursive version; like the iterative
	// version below, this should avoid blowing up the stack
	def grayTailRec(n : Int) = grayTailRec_(n, List(""))
	@tailrec def grayTailRec_(n : Int, acc : List[String]) : List[String] =
		if(n < 1) acc
		else grayTailRec_(n-1, step(acc))

	// now iterative -- has the advantage that it doesn't blow up the stack for
	// big n (though of course it blows up the heap anyway ;-)
	def grayIt(n : Int) = {
		var code = List("")
		for(i <- 1 to n) code = step(code)
		code
	}

	// a more fun one
	def grayStream = Stream.iterate(List(""))(step)
}
