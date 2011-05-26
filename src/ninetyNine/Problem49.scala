object Problem49 {
	def step(old : List[String]) =
		(old        map {s : String => "0" + s}) ++
		(old reverseMap {s : String => "1" + s})

	// the simplest one, I think: a recursive definition
	def grayRec(n : Int) : List[String] =
		if(n < 1) List("")
		else step(grayRec(n-1))

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
