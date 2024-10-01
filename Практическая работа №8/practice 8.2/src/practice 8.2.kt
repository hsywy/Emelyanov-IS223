//Практическая работа 8.2
//Емельянов Иван ИС223
fun differenceBetweenMaxAndMin(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("Список не должен быть пустым")
    }
    val max = numbers.maxOrNull() ?: throw IllegalStateException("Не удалось найти максимальное значение")
    val min = numbers.minOrNull() ?: throw IllegalStateException("Не удалось найти минимальное значение")
    return max - min
}

fun main() {
    val numbers = listOf(3, 5, 1, 9, 4)
    val result = differenceBetweenMaxAndMin(numbers)
    println("Разность между самым большим и самым маленьким: $result")
}