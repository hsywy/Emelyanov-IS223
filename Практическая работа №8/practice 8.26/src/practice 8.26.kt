//Практическая работа 8.26
//Емельянов Иван ИС223
fun lastElement(array: IntArray): Int {
    return array[array.size - 1]
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val last = lastElement(numbers)
    println("Последний элемент массива: $last")
}