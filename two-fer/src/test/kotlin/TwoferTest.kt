import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class TwoferTest {

    @Test
    fun aNameGiven() {
        assertEquals("One for Alice, one for me.", twofer("Alice"))
    }

    @Test
    fun anotherNameGiven() {
        assertEquals("One for Bob, one for me.", twofer("Bob"))
    }

    @Test
    fun emptyStringGiven() {
        assertEquals("One for , one for me.", twofer(""))
    }

}
