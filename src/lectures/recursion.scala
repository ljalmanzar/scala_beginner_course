package lectures

import scala.annotation.tailrec

object recursion extends App {
	def factorial(n: Int): Int = {
		if (n <= 1) 1
		else {
			println(s"computing factorial of $n - but first i need factorial ${n-1}")
			val res = n * factorial(n-1)
			println(s"computed factorial of $n")
			res
		}
	}
	println(factorial(10))
	
	def anotherFactorial(n: Int) : BigInt = {
		def factHelper(x: Int, accumulator: BigInt): BigInt = {
			if (x <= 1) accumulator
			else factHelper(x-1, accumulator * x)
		}
		
		factHelper(n, 1)
	}
	println(anotherFactorial(10))
	
	def concatStringNTimes(str: String, times: Int): String = {
		@tailrec
		def helper(remaining: Int, acc: String): String = {
			if (remaining == 0) acc
			else helper(remaining - 1, acc+str)
		}
		
		helper(times, str)
	}
	println(concatStringNTimes("boi", 10))
	
	def isPrime(num: Int): Boolean = {
		@tailrec
		def helper(divisor: Int): Boolean = {
			if (num % divisor == 0) false
			else if (divisor > (num / 2)) true
			else helper(divisor + 1)
		}
		helper(2)
	}
	println(isPrime(2003))
	println(isPrime(629))
	
	def fib(num: Int): Int = {
		// 1 1 2 3 5 8 13
		@tailrec
		def helper(iteration: Int, last: Int, secondLast: Int): Int = {
			if (iteration == num) last
			else helper(iteration + 1, last + secondLast, last)
		}
		
		helper(2, 1, 1)
	}
	println(fib(7))
}
