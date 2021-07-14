package collections

fun main() {
    val jorge = Funcionario("Jorge", 2000.0, "PJ" )
    val bowser = Funcionario("Bowser", 1200.0, "CLT" )
    val luke = Funcionario("Luke", 4000.0, "CLT" )

    println("---------------LIST---------------")
    val funcionarios = mutableListOf(bowser, luke)
    funcionarios.forEach{println(it)}

    println("---------------------------------")
    funcionarios.add(jorge)
    funcionarios.forEach{println(it)}

    println("---------------------------------")
    funcionarios.remove(luke)
    funcionarios.forEach{println(it)}

    println("---------------SET---------------")
    val funcionarioSet = mutableSetOf(bowser)
    funcionarioSet.forEach{println(it)}

    println("---------------------------------")
    funcionarioSet.add(jorge)
    funcionarioSet.add(luke)
    funcionarioSet.forEach{println(it)}

    println("---------------------------------")
    funcionarioSet.remove(bowser)
    funcionarioSet.forEach{println(it)}

}