import kotlin.math.floor
import kotlin.math.nextDown
import kotlin.math.roundToInt

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            var dices = IntArray(4){i -> (1..6).shuffled().random()}
            dices.sort()
            return dices[1] + dices[2] + dices[3]
        }

        fun modifier(score: Int): Int {
            return floor(((score - 10) / 2.0)).toInt()
        }
    }

}
