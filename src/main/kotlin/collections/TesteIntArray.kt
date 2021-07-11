package collections

fun main() {
    val values = IntArray(5)

    values [0] = 2
    values [1] = 7
    values [2] = 5
    values [3] = 3
    values [4] = 1

//    for (valor in values) {
//        println(valor)
//    }

//    values.forEach {
//        println(it)
//    }

    for (index in values.indices) {
        println(values[index])
    }

    println("------------------------------------------------")
    values.sort() //ordena em ordem crescente
    for(valor in values) {
        println(valor)
    }
}