import java.lang.IllegalArgumentException

class Dna(var dna: String) {
    private val Nucleotides = "AGCT"

    init {
        dna.forEach {
            if (!Nucleotides.contains(it))
                throw IllegalArgumentException()
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            return mutableMapOf<Char, Int>().apply {
                put('A', dna.filter { it == 'A' }.length)
                put('C', dna.filter { it == 'C' }.length)
                put('G', dna.filter { it == 'G' }.length)
                put('T', dna.filter { it == 'T' }.length)
            }
        }
}
