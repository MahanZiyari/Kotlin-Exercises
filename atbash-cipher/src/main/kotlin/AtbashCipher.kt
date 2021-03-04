object Atbash {

    fun encode(s: String): String{
        return decode(s)
            .chunked(5)
            .joinToString(" ")
    }

    fun decode(s: String): String{
        return s
            .toLowerCase()
            .filter { it.isLetterOrDigit() }
            .map { if (it.isLetter()) (219 - it.toInt()).toChar() else it }
            .joinToString("")
    }
}
