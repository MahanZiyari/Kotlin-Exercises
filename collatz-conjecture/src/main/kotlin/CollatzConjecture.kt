object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        return computeStepCount(start, 0)
    }

    private fun computeStepCount(start: Int, step: Int): Int {
        require(start > 0)
        return when {
            start == 1 -> step
            start % 2 == 0 -> computeStepCount(start / 2, step + 1)
            else -> computeStepCount(start * 3 + 1, step + 1)
        }
    }

}
