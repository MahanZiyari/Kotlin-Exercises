object Prime {

    fun nth(n: Int): Int {
        require(n > 0){ "There is no zeroth prime." }
        return primes.take(n).last()
    }

    val primes = generateSequence(2){
        var nextPrime = it + 1
        while(nextPrime.takeIf { (2 until it).all { x -> it % x != 0 } } == null)
            nextPrime++
        nextPrime
    }

}
