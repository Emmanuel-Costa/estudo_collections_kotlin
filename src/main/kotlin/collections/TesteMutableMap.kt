package collections

fun main() {
    val jorge = Funcionario("Jorge", 2000.0, "PJ" )
    val bowser = Funcionario("Bowser", 1200.0, "CLT" )
    val luke = Funcionario("Luke", 4000.0, "CLT" )

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(jorge.nome, jorge)
    repositorio.create(bowser.nome, bowser)
    repositorio.create(luke.nome, luke)

    println(repositorio.findById(jorge.nome))

    println("-------------------------------")
    repositorio.findAll().forEach{println(it)}

    println("-------------------------------")
    repositorio.remove(jorge.nome)
    repositorio.findAll().forEach{println(it)}

}