package exercicio_3

fun main() {
    // Criação do array de Aluno com capacidade para 5 alunos
    val alunos = Array(5) { Aluno("", doubleArrayOf()) }

    println("--------- CADASTRO DE ALUNOS ---------")
    for(i in 0..4){
        print("Nome Aluno: ")
        val nome = readln()

        print("Nota 1: ")
        val n1 = readln().toDouble()
        print("Nota 2: ")
        val n2 = readln().toDouble()
        print("Nota 3: ")
        val n3 = readln().toDouble()

        val notas = doubleArrayOf(n1,n2,n3)

        // Criação do objeto Aluno e inserção no array
        alunos[i] = Aluno(nome, notas)
        println("-----------------------------------------------")
    }


    alunos.forEach {
        if(it.foiAprovado()){
            println("Aluno ${it.nome} foi aprovado.")
        }else{
            println("Aluno ${it.nome} foi reprovado.")
        }
    }

    println("-----------------------------------------------")
    println("Fim do Programa =)")
}
