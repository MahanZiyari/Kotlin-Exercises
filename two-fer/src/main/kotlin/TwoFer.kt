internal fun twofer(name: String?): String {
    return name.let {
        "One for $it, one for me."
    }

}
