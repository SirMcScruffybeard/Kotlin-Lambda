fun main(args: Array<String>) {
	
	val firstLambda: (Int)-> Unit = {s: Int -> println(s) }
	
	addNumbers(1, 2, firstLambda)
	
}

fun addNumbers (a: Int, b: Int, firstLambda: (Int) -> Unit) {
	
	val sum = a + b
	
	firstLambda(sum)
}
		