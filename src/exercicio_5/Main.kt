package exercicio_5

fun main() {
    val dado1 = Dado()
    val dado2 = Dado()

    while(true){
        println("----------------------------")
        println("[1] Jogar Dado")
        println("[0] Sair")
        println("----------------------------")

        print("Opção: ")
        val opcao = readln().toInt()
        if(opcao != 0 && opcao != 1){
            println("Insira uma opção válida!")
            continue
        }else if(opcao == 1){
            val vlDado1 = dado1.jogar()
            val vlDado2 = dado2.jogar()

            println("Dado 1: $vlDado1")
            println("Dado 2: $vlDado2")
            println("Soma dos dados: ${vlDado1 + vlDado2}")
        }else break

    }
}
