data class Year(val year: Int) {

    val isLeap: Boolean get() {
        return when{
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            year % 4 == 0 -> true
            else -> false
        }
    }
}
