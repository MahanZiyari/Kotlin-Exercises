object Isogram {

    fun isIsogram(input: String): Boolean {
        var isogram = StringBuilder()
        input
            .toLowerCase()
            .filter { it.isLetter() }
            .forEach {
                if (isogram.contains(it))
                    return false
                else
                    isogram.append(it)
            }
        return true
    }

    fun toSetAlgorithm(input: String): Boolean{
        val letters = input.toLowerCase().filter(Char::isLetter).toList()
        return letters.toSet().size == letters.size
    }
}
