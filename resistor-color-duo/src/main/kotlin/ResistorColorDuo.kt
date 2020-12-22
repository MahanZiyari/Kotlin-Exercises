object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        //My solution
        /**
         * val firstColor = colors[0].ordinal
         * val secondColor = colors[1].ordinal
         * return  "$firstColor$secondColor".toInt()
         */

        //Alternative solution 1
        //return "${colors[0].ordinal}${colors[1].ordinal}".toInt()

        //Alternative solution 2
        return (colors[0].ordinal * 10) + colors[1].ordinal
    }
}
