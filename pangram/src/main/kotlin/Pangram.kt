object Pangram {

    fun isPangram(input: String): Boolean {
        val letters = mutableSetOf<Char>()
        input.toLowerCase().forEach {
            if (it.isLetter())
                letters.add(it)
        }
        return letters.size >= 26
    }
}
