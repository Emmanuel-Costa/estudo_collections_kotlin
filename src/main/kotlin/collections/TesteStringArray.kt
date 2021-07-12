package collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Jorge"
    nomes[1] = "Jaime"
    nomes[2] = "Debora"

    nomes.sort()
    nomes.forEach { println(it) }

    println("------------------------------")

    val nomes2 = arrayOf("Mario", "Link", "Zelda")
    nomes2.sort()
    nomes2.forEach { println(it) }

}