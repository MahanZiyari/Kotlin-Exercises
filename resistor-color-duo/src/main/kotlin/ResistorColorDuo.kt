object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        val firstColor = Color.valueOf(colors[0].name).ordinal
        val secondColor = Color.valueOf(colors[1].name).ordinal
        return  "$firstColor$secondColor".toInt()
    }
}
