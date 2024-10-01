//Практическая работа 8.18
//Емельянов Иван ИС223
fun main() {
    // Запрашиваем у пользователя ввод числа
    println("Введите число для проверки на простоту: ")
    val input = readLine()

    // Проверяем, что ввод является числом
    val number = input?.toIntOrNull()

    if (number != null && number >= 0) {
        // Проверяем, является ли число простым
        if (isPrime(number)) {
            println("Число $number является простым.")
        } else {
            println("Число $number не является простым.")
        }
    } else {
        println("Пожалуйста, введите неотрицательное целое число.")
    }
}

// Функция для проверки на простоту
fun isPrime(n: Int): Boolean {
    if (n < 2) return false // Числа меньше 2 не являются простыми
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false // Если n делится на i, то это не простое число
    }
    return true // Если не нашли делителей, число простое
}