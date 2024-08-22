package exercicio_2

fun main() {
    print("Entre com o parágrafo: ")
    val texto = readln().toString()

    val qtdPalavras = contaPalavras(texto)

    println("A contagem de palavras desse parágrafo é: $qtdPalavras")
}

fun contaPalavras(texto : String) : Int{
    val palavras = texto.split(" ")
    return palavras.size
}