package one.digitalinnovation.digioonebank.testes

import one.digitalinnovation.digioonebank.Cliente
import one.digitalinnovation.digioonebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}