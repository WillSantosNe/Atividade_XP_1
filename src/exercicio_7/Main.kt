package exercicio_7

fun main() {
    val voo = Voo(numeroDoVoo = 123, totalAssentos = 10)

    println("Bem-vindo ao sistema de reserva de passagens aéreas.")

    var continuar = true
    while (continuar) {
        println("\nDigite o número do assento que deseja verificar ou reservar (1 a 10):")
        val assento = readln().toIntOrNull()

        if (assento != null) {
            if (voo.verificarDisponibilidade(assento)) {
                println("O assento $assento está disponível. Deseja reservar? (s/n)")
                val resposta = readln()

                if (resposta.lowercase() == "s") {
                    if (voo.reservarAssento(assento)) {
                        println("Assento $assento reservado com sucesso!")
                    } else {
                        println("Erro ao reservar o assento $assento.")
                    }
                } else {
                    println("Reserva cancelada.")
                }
            } else {
                println("O assento $assento não está disponível.")
            }
        } else {
            println("Entrada inválida. Por favor, insira um número de assento válido.")
        }

        println("\nDeseja verificar ou reservar outro assento? (s/n)")
        continuar = readln().lowercase() == "s"
    }

    println("Obrigado por usar o sistema de reserva de passagens aéreas.")
}