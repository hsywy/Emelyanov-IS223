//Практическая работа №8.1
//Емельянов Иван ИС223
fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = sumOfList(numbers)
    println("Сумма всех элементов списка: $sum")
}