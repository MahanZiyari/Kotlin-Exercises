
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber > 0)
    return when{
        naturalNumber.isPerfect() -> Classification.PERFECT
        naturalNumber.isAbundant() -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
    }
}

fun Int.isPerfect():Boolean{
    return (1 until this).filter { this.rem(it) == 0 }.sum() == this
}

fun Int.isAbundant():Boolean{
    return (1 until this).filter { this.rem(it) == 0 }.sum() > this
}
