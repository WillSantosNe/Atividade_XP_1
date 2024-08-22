package exercicio_8

class Produto(var nome: String, var quantidade: Int, var nivelMinimo: Int, var nivelMaximo: Int){
    fun reporEstoque() {
        quantidade = nivelMaximo
        println("Estoque do produto $nome foi reposto para $nivelMaximo unidades.")
    }

    fun verificarEstoque() {
        if (quantidade < nivelMinimo) {
            println("Estoque do produto $nome está abaixo do nível mínimo ($quantidade unidades).")
            reporEstoque()
        } else {
            println("Estoque do produto $nome está em nível adequado ($quantidade unidades).")
        }
    }
}