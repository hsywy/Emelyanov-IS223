//Практическая работа 6.21
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${numbers.contentToString()}")
    print("Введите число для удаления: ")
    val removeNum = readLine()!!.toInt()
    val newArray = removeElement(numbers, removeNum)
    println("Массив после удаления: ${newArray.contentToString()}")
}

fun removeElement(array: IntArray, element: Int): IntArray {
    val newArray = IntArray(array.size - 1)
    var j = 0
    for (i in array.indices) {
        if (array[i] != element) {
            newArray[j] = array[i]
            j++
        }
    }
    return newArray
}