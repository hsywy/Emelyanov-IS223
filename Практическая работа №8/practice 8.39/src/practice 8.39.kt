//Практическая работа 8.39
//Емельянов Иван ИС223
fun reverseArray(array: IntArray): IntArray {
    var left = 0
    var right = array.size - 1

    while (left < right) {
        val temp = array[left]
        array[left] = array[right]
        array[right] = temp

        left++
        right--
    }

    return array
}
