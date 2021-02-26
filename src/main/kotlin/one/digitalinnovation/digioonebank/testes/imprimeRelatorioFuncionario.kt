package one.digitalinnovation.digioonebank.testes

import one.digitalinnovation.digioonebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}