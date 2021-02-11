class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        val x = a.toDouble()
        val y = b.toDouble()
        val z = c.toDouble()
        require(x + y > z && x + z > y && y + z > x)
    }

    val isEquilateral: Boolean = a == b && b == c
    val isIsosceles: Boolean = a == b || a == c || b == c
    val isScalene: Boolean = !isIsosceles
}
