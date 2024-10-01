//Практическая работа 6.26
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val average = calculateAverage(numbers)
    println("Среднее арифметическое: $average")
}

fun calculateAverage(array: IntArray): Double {
    if (array.isEmpty()) {
        return 0.0
    }
    val sum = array.sum()
    return sum.toDouble() / array.size
}