object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        return when(c.toLowerCase()){
            'f', 'h', 'v', 'w', 'y' -> 4
            'b', 'c', 'm', 'p' -> 3
            'd', 'g' -> 2
            'j', 'x' -> 8
            'q', 'z' -> 10
            'k' -> 5
            else -> 1
        }
    }

    fun scoreWord(word: String): Int {
        // alternate
        // word.map { scoreLetter(it) }.sum()
        // Tip: sum(map(f)) = sumBy(f)

        return word.sumBy { scoreLetter(it) }
    }
}
