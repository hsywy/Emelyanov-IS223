//Практическая работа 6.7
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${numbers.contentToString()}")
    val reversedNumbers = numbers.reversedArray()
    println("Обратный массив: ${reversedNumbers.contentToString()}")
}