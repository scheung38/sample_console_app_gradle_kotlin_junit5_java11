import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest {

    @Test
    fun `testAdd2`() {
        val expected = 7
        assertEquals(expected, add2(3, 4))
    }

    @Test
    fun `testDiff2`() {
        val expected = 4
        assertEquals(expected, diff2(5, 1))
    }

    @Test
    fun `testSolution0`() {
        val expected = 2
        val a: IntArray = intArrayOf(0, 4, -1, 0, 3)
        val b: IntArray = intArrayOf(0, -2, 5, 0, 3)
        assertEquals(expected, solution(a, b))
    }

    @Test
    fun `testSolution2`() {
        val expected = 1
        val arrA: IntArray = intArrayOf(2, -2, -3, 3)
        val arrB: IntArray = intArrayOf(0, 0, 4, -4)
        assertEquals(expected, solution(arrA, arrB))
    }


    @Test
    fun `testSolution4`() {
        val expected = 0
        val arrA: IntArray = intArrayOf(4, -1, 0, 3)
        val arrB: IntArray = intArrayOf(2, 6, 0, 4)
        assertEquals(expected, solution(arrA, arrB))
    }

    @Test
    fun `testSolution5`() {
        val expected = 0
        val arrA: IntArray = intArrayOf(3, 2, 6)
        val arrB: IntArray = intArrayOf(4, 1, 6)
        assertEquals(expected, solution(arrA, arrB))
    }

    @Test
    fun `testSolution6`() {
        val expected = 2 //index: 2 & 4
        val arrA: IntArray = intArrayOf(1, 4, 2, -2, 5)
        val arrB: IntArray = intArrayOf(7, -2, -2, 2, 5)
        assertEquals(expected, solution(arrA, arrB))
    }

    @Test
    fun `testSolution7`() {
        val expected = -1
        val arrA: IntArray = intArrayOf(1, 4, 2, -2, 5)
        val arrB: IntArray = intArrayOf(1)
        assertEquals(expected, solution(arrA, arrB))
    }

}

//https://kotlinlang.org/docs/jvm-test-using-junit.html#run-a-test