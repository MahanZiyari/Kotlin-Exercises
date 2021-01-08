import org.junit.Test
import org.junit.Assert.*;

class TestExample {

    private fun _countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
        if (input == null || input.size == 0) return arrayOf<Int>()
        var x = 0;
        var y = 0;
        for (i in 0..input.size-1) {
            if (input[i] > 0) x++;
            if (input[i] < 0) y += input[i];
        }
        return arrayOf(x, y);
    }

    @Test
    fun testFixed() {
        assertArrayEquals(arrayOf(10, -65), countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
        assertArrayEquals(arrayOf(8, -50), countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)))
        assertArrayEquals(arrayOf<Int>(), countPositivesSumNegatives(null))
        assertArrayEquals(arrayOf<Int>(), countPositivesSumNegatives(arrayOf<Int>()))
    }

    @Test
    fun testRandom() {
        for(i in 1..96) {
            val elementsNumber = (Math.floor(Math.random() * 100)).toInt()
            val input = Array<Int>(elementsNumber) {(Math.floor(Math.random() * 1000) - 500).toInt()}
            assertArrayEquals(_countPositivesSumNegatives(input), countPositivesSumNegatives(input));
        }
    }
}