import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.lang.StringBuilder
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class IsogramTest(val input: String, val expectedOutput: Boolean) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: isogram({0}) = {1}")
        fun data() = listOf(
                arrayOf("", true),
                arrayOf("isogram", true),
                arrayOf("eleven", false),
                arrayOf("zzyzx", false),
                arrayOf("subdermatoglyphic", true),
                arrayOf("Alphabet", false),
                arrayOf("alphAbet", false),
                arrayOf("thumbscrew-japingly", true),
                arrayOf("thumbscrew-jappingly", false),
                arrayOf("six-year-old", true),
                arrayOf("Emily Jung Schwartzkopf", true),
                arrayOf("accentor", false),
                arrayOf("angola", false)
        )
    }

    @Test
    fun test() {
        assertEquals(expectedOutput, Isogram.isIsogram(input))
    }

    @Test
    fun LongLengthTestOnMine(){
        assertEquals(false, Isogram.isIsogram(generateRandomString(100)))
    }

    @Test
    fun LongLengthTestOnOther(){
        assertEquals(false, Isogram.toSetAlgorithm(generateRandomString(100)))
    }




    fun generateRandomString(limit: Int): String{
        val characters = "abcdefghijklmnopqrstuvwxyz !@#$%^&*()_-=+`~,.<>/?;:'[]{}|   0123456789"
        var string = StringBuilder()
        for (i in 0 .. limit){
            string.append(characters.random())
        }
        return string.toString()
    }

}
