object ResistorColorTrio {

    fun text(vararg input: Color): String {
        val stringForm = convertToString(input[0].ordinal, input[1].ordinal, input[2].ordinal)
        return unitFinder(stringForm, 0)
    }

    private fun convertToString(vararg num: Int): String {
        var str = (num[0] * 10 + num[1]).toString()
        for (i in 0 until num[2])
            str += "0"
        return str
    }

    private fun countZeroes(s: String): Int {
        var count = 0
        s.forEach {
            if (it == '0')
                count++
        }
        return count
    }


    private fun unitFinder(s: String, count: Int): String {
        var str: String
        val zeroCount = countZeroes(s)
        if (zeroCount < 3)
            return s + " " + Unit.values()[count].name.toLowerCase()
        s.reversed().removeRange(0, 3).also { str = it }
        return unitFinder(str.reversed(), count + 1)
    }
}
