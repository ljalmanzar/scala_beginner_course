package lectures

object StringOps extends App {
	println("Hello".substring(1, 3))
	println("Hello my name is shady".split(" ").toList)
	
	val aNumberString = "2"
	val aNumber = aNumberString.toInt
	println('a' +: aNumberString :+ 'z')
	
	val name = "David"
	val age = 12
	// F-interpolators
	val speed = 1.2f
	val myth = f"$name can eat $speed%2.2f burgers per minute"
	println(myth)
	
	// raw-interpolator
	println(raw"This is a \n newline")
	val escaped = "This is a \n newline"
	println(raw"$escaped")
}
