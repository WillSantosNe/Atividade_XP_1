package exercicio_6

fun main() {
    val temperaturas = DoubleArray(30)

    for (i in temperaturas.indices) {
        print("Digite a temperatura do dia ${i + 1}: ")
        temperaturas[i] = readln().toDouble()
    }

    val media = temperaturas.average()

    val temperaturaMaxima = temperaturas.maxOrNull()
    val temperaturaMinima = temperaturas.minOrNull()

    if (temperaturaMaxima != null && temperaturaMinima != null) {
        val tempMax = temperaturaMaxima.toDouble()
        val tempMin = temperaturaMinima.toDouble()

        // Convertendo DoubleArray para List<Double> para usar indexOf
        val temperaturasList = temperaturas.toList()

        val diaMaxima = temperaturasList.indexOf(tempMax) + 1
        val diaMinima = temperaturasList.indexOf(tempMin) + 1

        println("\nTemperatura média do mês: %.2f".format(media))
        println("Temperatura máxima: $tempMax°C (Dia $diaMaxima)")
        println("Temperatura mínima: $tempMin°C (Dia $diaMinima)")
    }
}
