package exercicio_3

class Aluno(var nome : String, var notas: DoubleArray) {

    fun calcularMedia(): Double {
        return notas.average()
    }

    fun foiAprovado() : Boolean{
        return calcularMedia() >= 7
    }
}