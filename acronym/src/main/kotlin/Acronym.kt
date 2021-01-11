object Acronym {
    fun generate(phrase: String) : String {
        return phrase
            .split(" ")
            .asSequence()
            .map { it.split("-") }
            .flatten()
            .filter { it.isNotEmpty() }
            .map { it.filter { it.isLetter() } }
            .map { it[0].toUpperCase() }
            .joinToString()
            .filter { it.isLetter() }
    }
}
