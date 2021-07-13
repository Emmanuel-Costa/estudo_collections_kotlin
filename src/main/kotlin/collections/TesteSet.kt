package collections

fun main() {
    val jorge = Funcionario("Jorge", 2000.0, "PJ" )
    val bowser = Funcionario("Bowser", 1200.0, "CLT" )
    val luke = Funcionario("Luke", 4000.0, "CLT" )

    val funcionarios1 = setOf(jorge, bowser)
    val funcionarios2 = setOf(luke)
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("----------------------------------")
    val funcionarios3 = setOf(jorge, bowser, luke)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println("----------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{println(it)}
}