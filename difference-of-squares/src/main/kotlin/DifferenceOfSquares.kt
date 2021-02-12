import kotlin.math.abs

class Squares(val n: Int){

    fun sumOfSquares(): Int = (1 .. n).map { it.pow(2) }.sum()
    fun squareOfSum(): Int = (1 .. n).sum().pow(2)
    fun difference(): Int  = abs(squareOfSum() - sumOfSquares())

    fun Int.pow(n: Int): Int{
        if (n == 1)
            return this
        else
            return this * pow(n - 1)
    }
}
