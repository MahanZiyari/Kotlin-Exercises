fun transcribeToRna(dna: String): String {
    return dna.toRNA()
}

private fun String.toRNA(): String {
    val rna = StringBuilder()
    this.forEach {
        if (it.equals('C'))
            rna.append('G')
        else if (it.equals('G'))
            rna.append('C')
        else if (it.equals('T'))
            rna.append('A')
        else if (it.equals('A'))
            rna.append('U')
    }
    return rna.toString()
}
