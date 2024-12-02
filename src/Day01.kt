import java.util.regex.Pattern
import kotlin.math.absoluteValue

fun main() {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    readInput("Day01").forEach { s ->
        val (a, b) = s.split(Pattern.compile("\\s+")).map { it.trim().toInt() }
        list1.add(a)
        list2.add(b)
    }
    list1.sorted().zip(list2.sorted()).map { (a, b) -> (a - b).absoluteValue }.sum().println()
}
