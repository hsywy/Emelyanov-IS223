//Практическая работа 8.29
//Емельянов Иван ИС223
fun findMaxAndMin(array: IntArray): Pair<Int, Int> {
    var max = array[0]
    var min = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
        if (array[i] < min) {
            min = array[i]
        }
    }
    return Pair(max, min)
}