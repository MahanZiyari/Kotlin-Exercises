object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase
            .split("([^\\w']|(?<!\\w)'|'(?!\\w))+".toRegex())
            .filter{it.isNotEmpty()}
            .groupingBy{it.toLowerCase()}
            .eachCount()


        // this is not my original solution
        // source: user grimord's solution
    }
}
