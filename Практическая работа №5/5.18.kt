//Практическая работа 5.18
//Емельянов Иван ИС223
fun main() {
    print("Введите высоту лестницы: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
