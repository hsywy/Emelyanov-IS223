//Практическая работа 6.18
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val groupSize = 5
    for (i in 0 until numbers.size step groupSize) {
        val group = numbers.copyOfRange(i, Math.min(i + groupSize, numbers.size))
        println("Группа: ${group.contentToString()}")
    }
}