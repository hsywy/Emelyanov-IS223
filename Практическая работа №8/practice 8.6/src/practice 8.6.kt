//Практическая работа 8.6
//Емельянов Иван ИС223
fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return (num1 + num2) < 100
}

fun main() {
    // Пример использования функции
    val number1 = 30
    val number2 = 50

    val result = isSumLessThan100(number1, number2)
    println("Сумма меньше 100: $result") // Вывод: Сумма меньше 100: true или false
}