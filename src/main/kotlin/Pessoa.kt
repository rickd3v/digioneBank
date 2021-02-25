class Pessoa {
    var nome = "Felipe"
    var cpf = "458.657.487-58"
    private set
}

fun main() {
    val Felipe = Pessoa()

    println(Felipe.nome)
    println(Felipe.cpf)
}