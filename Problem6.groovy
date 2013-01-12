def range = 1..100
def sumOfSquares = 0
def squareOfSums = 0

range.each() {
	sumOfSquares += it * it
	squareOfSums += it
}

squareOfSums *= squareOfSums

println squareOfSums - sumOfSquares
