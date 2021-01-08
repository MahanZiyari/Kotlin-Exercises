object Bob {
    fun hey(input: String): String {
        val str = input.trim()
        return when{
            str.isBlank() -> "Fine. Be that way!"
            str.isAllUpperCase() && str.endsWith('?') -> "Calm down, I know what I'm doing!"
            str.endsWith('?') -> "Sure."
            str.isAllUpperCase() -> "Whoa, chill out!"
            else -> "Whatever."
        }

    }
}

private fun String.isAllUpperCase(): Boolean{
    this.forEach {
        if (it.isLetter() && !it.isUpperCase())
            return false
    }
    return !this.isOnlyDigits()
}

private fun String.isOnlyDigits(): Boolean{
    this.forEach {
        if (it.isLetter())
            return false
    }
    return true
}
