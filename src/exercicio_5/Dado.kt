package exercicio_5
import java.util.Random

class Dado {

    fun jogar() : Int{
        return Random().nextInt(6) + 1
    }
}