import org.junit.Assert.*
import org.junit.Test

class PositiveTest {
    @Test
    fun testFixed() {
        assertEquals(15, sum(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sum(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sum(intArrayOf()))
        assertEquals(0, sum(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sum(intArrayOf(-1, 2, 3, 4, -5)))
    }

    private fun random(min: Int, max: Int): Int =  min + (Math.random() * (max - min)).toInt()

    private fun randomArray(): IntArray = IntArray(random(10, 5000)){random(-100, 100)}

    private fun _sum(arr: IntArray): Int = arr.fold(0){ a, b -> a + (if (b < 0) 0 else b)}

    @Test
    fun testRandom() {
        for (i in 0..99) {
            val arr = randomArray()
            assertEquals(_sum(arr), sum(arr))
        }
    }
}