package collections

fun main() {
    val values = intArrayOf(2, 3, 5, 7, 8, 9)

    values.sort()
    values.forEach {
        println(it)
    }
}