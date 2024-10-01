//Практическая работа 8.19
//Емельянов Иван ИС223
fun main() {
    // Пример массива целых чисел
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // Вызов функции и вывод результата
    val sum = sumOfArray(numbers)
    println("Сумма чисел в массиве: $sum")
}

// Функция для вычисления суммы чисел в массиве
fun sumOfArray(array: Array<Int>): Int {
    var sum = 0
    for (number in array) {
        sum += number // Суммируем каждое число в массиве
    }
    return sum // Возвращаем итоговую сумму
}