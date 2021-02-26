package one.digitalinnovation.digioonebank.testes

import one.digitalinnovation.digioonebank.Gerente


fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "123.456.789-10", salario = 5000.0, senha = "senha123")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
