package exercicio_4

fun main() {
    val nomes = Array(10) { "" }

    // Leitura dos nomes dos alunos
    for (i in nomes.indices) {
        print("Digite o nome do aluno ${i + 1}: ")
        nomes[i] = readln()
    }

    // Ordenação dos nomes em ordem alfabética
    val nomesOrdenados = nomes.sorted()

    // Exibição da lista ordenada
    println("\nLista de alunos em ordem alfabética:")
    for (nome in nomesOrdenados) {
        println(nome)
    }
}
