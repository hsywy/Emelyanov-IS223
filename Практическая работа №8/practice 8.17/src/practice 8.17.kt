//Практическая работа 8.17
//Емельянов Иван ИС223
fun main() {
    // Запрашиваем у пользователя ввод числа
    println("Введите число для вычисления факториала: ")
    val input = readLine()

    // Проверяем, что ввод является числом
    val number = input?.toIntOrNull()

    if (number != null && number >= 0) {
        // Вычисляем и выводим факториал
        val factorial = calculateFactorial(number)
        println("Факториал числа $number равен $factorial")
    } else {
        println("Пожалуйста, введите неотрицательное целое число.")
    }
}

// Функция для вычисления факториала
fun calculateFactorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        n * calculateFactorial(n - 1)
    }
}