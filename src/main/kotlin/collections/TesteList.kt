package collections

fun main() {
    val jorge = Funcionario("Jorge", 2000.0, "PJ" )
    val bowser = Funcionario("Bowser", 1200.0, "CLT" )
    val luke = Funcionario("Luke", 4000.0, "CLT" )

    val funcionarios = listOf(jorge, bowser, luke)

    funcionarios.forEach { println(it) }

    println("------------------------------")
    println(funcionarios.find { it.nome == "Bowser" })

    println("------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario (
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
) {
    override fun toString():String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}