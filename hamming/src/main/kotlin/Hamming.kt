import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")
        return leftStrand.findHammingDistance(rightStrand)
    }
}

fun String.findHammingDistance(rightStrand: String): Int{
    var n = this.length
    var distance = 0
    for (i in 0 until n){
        if (this[i] != rightStrand[i])
            distance++
    }
    return distance
}
