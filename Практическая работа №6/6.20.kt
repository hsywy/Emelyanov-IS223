//Практическая работа 6.20
//Емельянов Иван ИС223
fun main() {
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    print("Введите количество элементов: ")
    val count = readLine()!!.toInt()
    val numbers = IntArray(count) { start + step * it }
    println("Арифметическая прогрессия: ${numbers.contentToString()}")
}