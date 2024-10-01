//Практическая работа 6.14
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Числа, делящиеся на 3:")
    for (i in numbers) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
}