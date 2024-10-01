//Практическая работа 9.8
//Емельянов Иван ИС223
import java.util.*

fun main() {
    val random = Random()
    val numberToGuess = random.nextInt(100) + 1

    var guess: Int

    do {
        print("Guess a number between 1 and 100: ")
        guess = readLine()!!.toIntOrNull() ?: 0

        if (guess == numberToGuess) {
            println("Congratulations! You guessed the number.")
        } else if (guess < numberToGuess) {
            println("Your guess is too low.")
        } else {
            println("Your guess is too high.")
        }
    } while (guess != numberToGuess)
}
