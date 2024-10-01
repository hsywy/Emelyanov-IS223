//Практическая работа 6.28
//Емельянов Иван ИС223
fun main() {
    print("Введите количество элементов массива: ")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива:")
    for (i in 0 until size) {
        numbers[i] = readLine()!!.toInt()
    }
    println("Введенный массив: ${numbers.contentToString()}")
}