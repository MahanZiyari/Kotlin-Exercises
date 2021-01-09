import org.junit.Test

import org.junit.Assert.*
import java.util.*

class ProdFibTest {

    @Test
    fun test1() {
        val r = longArrayOf(55, 89, 1)
        assertArrayEquals(r, productFib(4895))
    }
    @Test
    fun test2() {
        val r = longArrayOf(89, 144, 0)
        assertArrayEquals(r, productFib(5895))
    }

    @Test
    fun test3() {
        val r = longArrayOf(6765, 10946, 1)
        assertArrayEquals(r, productFib(74049690))
    }
    @Test
    fun test4() {
        val r = longArrayOf(10946, 17711, 0)
        assertArrayEquals(r, productFib(84049690))
    }
    @Test
    fun test5() {
        val r = longArrayOf(10946, 17711, 1)
        assertArrayEquals(r, productFib(193864606))
    }
    @Test
    fun test6() {
        val r = longArrayOf(610, 987, 0)
        assertArrayEquals(r, productFib(447577))
    }
    @Test
    fun test7() {
        val r = longArrayOf(610, 987, 1)
        assertArrayEquals(r, productFib(602070))
    }
    @Test
    fun test8() {
        val r = longArrayOf(832040, 1346269, 0)
        assertArrayEquals(r, productFib(602070602070L))
    }
    @Test
    fun test9() {
        val r = longArrayOf(832040, 1346269, 1)
        assertArrayEquals(r, productFib(1120149658760L))
    }
    @Test
    fun test10() {
        val r = longArrayOf(1346269, 2178309, 1)
        assertArrayEquals(r, productFib(2932589879121L))
    }
    @Test
    fun test11() {
        val r = longArrayOf(1, 1, 1)
        assertArrayEquals(r, productFib(1))
    }
    @Test
    fun test12() {
        val r = longArrayOf(1836311903L, 2971215073L, 0)
        assertArrayEquals(r, productFib(4456077604922913920L))
    }
    @Test
    fun test() {
        val rnd = Random()
        val someFibs = longArrayOf(55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986)
        for (k in 0..14)
        {
            val rn = rnd.nextInt(someFibs.size - 1)
            val f1 = someFibs[rn]
            val f2 = someFibs[rn + 1]
            val p = f1 * f2
            val r = longArrayOf(f1, f2, 1L)
            println("Random test " + k)
            assertArrayEquals(r, productFib(p))
        }
    }
}