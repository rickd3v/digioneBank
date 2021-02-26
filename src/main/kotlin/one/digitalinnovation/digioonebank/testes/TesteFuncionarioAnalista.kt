package one.digitalinnovation.digioonebank.testes

import one.digitalinnovation.digioonebank.Analista

fun main() {
    val joao = Analista(nome = "João Pedro", cpf = "123.456.789-10", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(joao)
}