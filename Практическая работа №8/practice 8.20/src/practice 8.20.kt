//Практическая работа 8.20
//Емельянов Иван ИС223
fun findMax(array: IntArray): Int {
    if (array.isEmpty()) {
        throw IllegalArgumentException("Массив не может быть пустым")
    }
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    return max
}

fun main() {
    val numbers = intArrayOf(1, 5, 2, 8, 3)
    val maxNumber = findMax(numbers)
    println("Наибольшее число в массиве: $maxNumber")
}