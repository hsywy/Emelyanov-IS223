//Практическая работа 8.15
//Емельянов Иван ИС223
fun maxOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val number1 = 7
    val number2 = 12

    // Вызов функции maxOfTwo для получения большего числа
    val result = maxOfTwo(number1, number2)

    // Вывод результата на экран
    println("Большее число между $number1 и $number2 равно $result")
}