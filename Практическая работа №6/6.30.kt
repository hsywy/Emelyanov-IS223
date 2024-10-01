//Практическая работа 6.30
//Емельянов Иван ИС223
fun main() {
    import kotlin.random.Random
    val numbers = IntArray(100) { Random.nextInt(1, 101) }
    val groupSize = 10
    for (i in 0 until 10) {
        val group = numbers.copyOfRange(i * groupSize, (i + 1) * groupSize)
        println("Группа ${i + 1}: ${group.contentToString()}")
    }
}