//Практическая работа 5.22s
//Емельянов Иван ИС223
fun main() {
    import kotlin.random.Random
    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0
    println("Угадайте число от 1 до 100.")
    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()!!.toInt()
        attempts++
        if (guess < secretNumber) {
            println("Загаданное число больше.")
        } else if (guess > secretNumber) {
            println("Загаданное число меньше.")
        } else {
            println("Поздравляю! Вы угадали за $attempts попыток.")
            break
        }
    }
}
