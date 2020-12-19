internal fun twofer(name: String?): String {
    return name.let {
        "One for $name, one for me."
    }

}
