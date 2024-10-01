//Практическая работа 8.28
//Емельянов Иван ИС223
fun createArrayFrom1ToN(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = i + 1
    }
    return array
}
