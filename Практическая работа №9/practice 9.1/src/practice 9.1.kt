//Практическая работа 9.1
//Емельянов Иван ИС223
import java.util.Random

fun main() {
    val random = Random()

    for (i in 1..10) {
        println(random.nextInt(100) + 1)
    }
}
