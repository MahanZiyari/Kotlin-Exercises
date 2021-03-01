object Sieve {

    fun primesUpTo(upperBound: Int): List<Int> {
        if (upperBound == 2) return listOf(2)

        val numbers = (2 .. upperBound).toMutableList()
        val result  = mutableListOf<Int>()

        for (i in 2 until upperBound){
            println("i = ${i}")
            if (i in numbers)
                result.add(i)
            numbers.removeIf { it % i == 0 }
        }



        return result
    }

}
