package one.digitalinnovation.digioonebank.testes

import one.digitalinnovation.digioonebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)


}