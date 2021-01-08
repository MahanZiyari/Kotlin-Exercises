fun longestConsec(strarr: Array<String>, k: Int): String {

    return if (strarr.isEmpty() || k <= 0 || k > strarr.size) ""
    else {
        strarr // eg: strarr = ["zone", "twenty", "luv"], k = 2
            .toList() // to use windowed
            .windowed(size = k) // [ ["zone", "twenty"], ["twenty", "luv"] ]
            .map { it.joinToString("") } // [ "zonetwenty", "twentyluv" ]
            .maxBy(String::length)!! // "zonetwenty"
    }

    //Alternate Solution
    {
        /*val n = strarr.size
        if (n == 0 || k > n || k < 0)
            return ""
        var str = ""
        val myLIst = mutableListOf<String>()
        for (i in k - 1 until n) {
            for (j in i - (k - 1)..i)
                str += strarr[j]
            myLIst.add(str).also {
                str = ""
            }
        }
        return myLIst.maxByOrNull { it.length }!!*/
    }
}