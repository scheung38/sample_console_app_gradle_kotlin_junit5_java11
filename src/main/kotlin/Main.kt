fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
    val res: Int? = add2(1, 2)
    println("res is: $res")

    val arrA: IntArray = intArrayOf(1, 4, 2, -2, 5)
    val arrB: IntArray = intArrayOf(7, -2, -2, 2, 5)

    var res2: Int? = solution(arrA, arrB)
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
        println("sizeArray is $sizeArray")

        for (i in 1 until sizeArray) {
            println("i is : $i")
            println(i)
            var res0: Int? = A.toMutableList().chunked(i)[0].sum()
            var res1: Int? = A.toMutableList().chunked(i)[1].sum()
            var res2: Int? = B.toMutableList().chunked(i)[0].sum()
            var res3: Int? = B.toMutableList().chunked(i)[1].sum()

            println("res0 is: $res0")

            when (setOf(res0)) {
                setOf(res1, res2, res3) -> fairAccumulated++

                else -> println("No match")
            }

        }
        println("Final fairAccumulated is $fairAccumulated")
        fairAccumulated

    } catch (e: IllegalArgumentException) {
        println("Something wrong happened: ${e.message}")
        return -1
    } catch (e: Exception) {
        println("e.printStackTrace() is $e.printStackTrace()")
        return -1
    }
}