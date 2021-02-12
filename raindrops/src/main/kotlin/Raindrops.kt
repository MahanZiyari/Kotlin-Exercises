object Raindrops {

    fun convert(n: Int): String = buildString {
        if (n.rem(3) == 0) this.append("Pling")
        if (n.rem(5) == 0) this.append("Plang")
        if (n.rem(7) == 0) this.append("Plong")
        if (this.isEmpty()) this.append(n)
    }
}
