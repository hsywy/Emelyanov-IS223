//Практическая работа 8.21
//Емельянов Иван ИС223
fun sortArrayAscending(array: IntArray): IntArray {
    val sortedArray = array.copyOf() // Создаем копию массива, чтобы не изменять исходный
    for (i in 0 until sortedArray.size - 1) {
        for (j in i + 1 until sortedArray.size) {
            if (sortedArray[i] > sortedArray[j]) {
                // Меняем местами элементы, если они не в порядке возрастания
                val temp = sortedArray[i]
                sortedArray[i] = sortedArray[j]
                sortedArray[j] = temp
            }
        }
    }
    return sortedArray
}

fun main() {
    val numbers = intArrayOf(5, 2, 8, 1, 9, 3)
    val sortedNumbers = sortArrayAscending(numbers)
    println("Отсортированный массив: ${sortedNumbers.contentToString()}")
}