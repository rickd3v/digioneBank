class Pessoa {
    var nome = "Felipe"
    var cpf = "458.657.487-58"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val Felipe = Pessoa()
    println(Felipe.pessoaInfo())

}