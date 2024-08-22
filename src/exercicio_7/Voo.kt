package exercicio_7

class Voo(val numeroDoVoo: Int, val totalAssentos: Int) {
    // Inicializa todos os assentos como disponíveis (1 significa disponível, 0 significa reservado)
    private val assentosDisponiveis = IntArray(totalAssentos) { 1 }

    fun reservarAssento(assento: Int): Boolean {
        return if (assento in 1..totalAssentos && assentosDisponiveis[assento - 1] == 1) {
            assentosDisponiveis[assento - 1] = 0
            true
        } else {
            false
        }
    }

    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in 1..totalAssentos && assentosDisponiveis[assento - 1] == 1
    }

    fun mostrarAssentos() {
        println("Status dos assentos no voo $numeroDoVoo:")
        for (i in assentosDisponiveis.indices) {
            val status = if (assentosDisponiveis[i] == 1) "Disponível" else "Reservado"
            println("Assento ${i + 1}: $status")
        }
    }
}