
fun productFib(prod:Long):LongArray {
    var i = 0
    val fibo  = mutableListOf<Long>(0,1)
    do {
        if (fibo[i] * fibo[i+1] == prod)
            return longArrayOf(fibo[i], fibo[i+1], 1)
        fibo.add(fibo[i] + fibo[i+1])
        i++
    }while (fibo[i] * fibo[i+1] <= prod)
    return longArrayOf(fibo[i], fibo[i+1], 0)
}