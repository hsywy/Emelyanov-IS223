//Практическая работа 6.13
//Емельянов Иван ИС223
fun main() {
    import kotlin.random.Random
    val numbers = IntArray(20) { Random.nextInt(1, 101) } // Случайные числа от 1 до 100
    println("Массив из случайных чисел: ${numbers.contentToString()}")
}