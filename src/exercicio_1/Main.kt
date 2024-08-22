package exercicio_1

fun main(){
    print("Digite um número inteiro: ")
    var numero = readln().toInt()

    if (ehPrimo(numero)) {
        println("O número $numero é primo")
    } else {
        println("O número $numero não é primo")
    }
}

fun ehPrimo(numero : Int) : Boolean {
    if (numero <= 1) return false
    if (numero == 2) return true
    if (numero % 2 == 0) return false

    //O laço começa em 3 e vai até a raiz quadrada do numero
    for (i in 3..Math.sqrt(numero.toDouble()).toInt() step 2) {
        if (numero % i == 0) return false
    }
    return true
}