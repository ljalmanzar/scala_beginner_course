package lectures

object functions extends App {
	def fib(num: Int): Int = {
		if (num == 1 || num == 2) 1
		else {
			fib(num - 1) + fib (num - 2)
		}
	}
	
	println(fib(42))
}

