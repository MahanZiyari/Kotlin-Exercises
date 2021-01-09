import kotlin.math.pow

object Darts {

    fun score(x: Number, y: Number): Int {
        val radius = x.pow(2)+y.pow(2)
        return when{
            radius <= 1 -> 10
            radius > 1 && radius <= 25 -> 5
            radius > 25 && radius <= 100 -> 1
            else ->0
        }
    }


    private fun Number.pow(power: Int): Double = this.toDouble().pow(power.toDouble())
}
