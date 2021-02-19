object Luhn {

    fun isValid(candidate: String): Boolean {
        if (! candidate.all { it.isDigit() || it == ' ' }) return false


        return if (candidate.filter { it.isDigit() }.length < 2){
            false
        }
        else{
            var sum = candidate.filter { it.isDigit() }
                .map { it.toString().toInt() }
                .asReversed()
                .withIndex()
                .map {
                    when{
                        it.index % 2 == 0 -> it.value
                        it.value >= 5 -> it.value * 2 - 9
                        else -> it.value * 2
                    }
                }
                .sum()

            return sum.rem(10) == 0
        }
    }
}
