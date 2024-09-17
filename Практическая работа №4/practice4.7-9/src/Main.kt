//Практическая работа 4.7-9
//Емельянов Иван ИС223
fun main() {
    print("Введите строку: ")
    val input = readLine() ?: return

    val length = input.length

    val lengthType = when {
        length < 10 -> "короткой"
        length in 10..20 -> "средней"
        else -> "длинной"
    }

    println("Введённая строка является $lengthType.")
}