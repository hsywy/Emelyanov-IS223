//Практическая работа 6.17
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    var product = 1
    for (i in numbers) {
        sum += i
        product *= i
    }
    println("Сумма элементов: $sum")
    println("Произведение элементов: $product")
}