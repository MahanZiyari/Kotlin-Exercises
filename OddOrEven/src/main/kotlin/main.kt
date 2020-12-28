
fun simpleMultiplication(n: Int): Int {
    return when{
        n%2 == 0 -> n*8
        else -> n*9
    }
}