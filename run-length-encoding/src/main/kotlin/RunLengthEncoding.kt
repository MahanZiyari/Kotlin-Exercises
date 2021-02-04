object RunLengthEncoding {

    fun encode(input: String): String {
        var count = 1
        var result  = StringBuilder()
        for (i in 1 until input.length){
            if (input[i] == input[i-1]){
                count++
            }
            else{
                if (count > 1) result.append("$count${input[i-1]}") else result.append("${input[i-1]}")
                count = 1
            }

        }

        if (input.isNotEmpty())
            if (count > 1)
                result.append("$count${input[input.length-1]}")
            else
                result.append("${input[input.length-1]}")

        return result.toString()


        // Solution with regex

        /*input.replace(Regex("(.)\\1+")) {
            String.format("%d%s", it.value.length, it.groupValues[1])
        }*/
    }

    fun decode(input: String): String {
        var result = StringBuilder()
        var count = 0
        input.forEach { c ->
            if (c.isDigit())
                count = count * 10 + c.toString().toInt()
            if (!c.isDigit()){
                if (count <= 1)
                    result.append(c)
                else
                    result.append("$c".repeat(count))
                count = 0
            }
        }
        return result.toString()
    }

    // Solution with regex
    /*input.replace(Regex("(\\d+)(.)")) {
        it.groupValues[2].repeat(it.groupValues[1].toInt())
    }*/
}
