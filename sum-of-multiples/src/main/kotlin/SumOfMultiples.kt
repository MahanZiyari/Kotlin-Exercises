object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val multiples = mutableSetOf<Int>()
        for (i in 0 until limit){
            factors.filter { it != 0 }.forEach {
                if (i.rem(it) == 0)
                    multiples.add(i)
            }
        }
        return multiples.sum()
    }
}

