//Практическая работа 10.2
//Емельянов Иван ИС223
fun pyramid(n: Int) {
    for (i in 1..n) {
        // Вывод пробелов
        for (j in 1..n - i) {
            print(" ")
        }

        // Вывод #
        for (j in 1..2 * i - 1) {
            print("#")
        }

        // Переход на новую строку
        println()
    }
}

fun main() {
    pyramid(1)
    pyramid(2)
    pyramid(3)
}
