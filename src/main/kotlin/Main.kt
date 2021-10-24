fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
    val res: Int? = add2(1, 2)
    println("res is: $res")

    val arrA: IntArray = intArrayOf(1, 4, 2, -2, 5)
    val arrB: IntArray = intArrayOf(7, -2, -2, 2, 5)

    val res2: Int? = solution(arrA, arrB)
    println("returned res2 is: $res2")

}

fun add2(a: Int, b: Int): Int? {
    // TODO("Not yet implemented")
    return a + b
}

fun diff2(a: Int, b: Int): Int? {
    // TODO("Not yet implemented")
    return a - b
}

fun solution(A: IntArray, B: IntArray): Int? {
    var fairAccumulated: Int = 0
    return try {
        val sizeArray = A.size
        for (i in 1 until sizeArray) {

            var res0 = A.toMutableList().subList(0, i).sum()
            var res1 = A.toMutableList().subList(i, sizeArray).sum()
            var res2 = B.toMutableList().subList(0, i).sum()
            var res3 = B.toMutableList().subList(i, sizeArray).sum()

            // Logic to check when res0 == res1 == res2 == res3
            when (setOf(res0)) {
                setOf(res1, res2, res3) -> fairAccumulated++
                else -> println("No match")
            }
        }
        fairAccumulated

    } catch (e: IllegalArgumentException) {
        println("Something wrong happened: ${e.message}")
        return -1
    } catch (e: Exception) {
        println("e.printStackTrace() is $e.printStackTrace()")
        return -1
    }
}