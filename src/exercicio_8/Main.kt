package exercicio_8

fun main() {
    val produtos = mutableListOf<Produto>()

    // Cadastro de 5 produtos
    for (i in 1..5) {
        println("Cadastro do produto $i:")

        print("Nome: ")
        val nome = readln()

        print("Quantidade atual: ")
        val quantidade = readln().toInt()

        print("Nível mínimo: ")
        val nivelMinimo = readln().toInt()

        print("Nível máximo: ")
        val nivelMaximo = readln().toInt()

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)

        println("-----------------------------------------------")
    }

    // Verificação do estoque de cada produto
    println("\nVerificando o estoque de todos os produtos...\n")
    for (produto in produtos) {
        produto.verificarEstoque()
    }

    println("\nSistema de gestão de estoque finalizado.")
}