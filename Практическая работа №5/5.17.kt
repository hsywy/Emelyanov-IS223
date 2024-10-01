//Практическая работа 5.17
//Емельянов Иван ИС223
fun main() {
    print("Введите строку: ")
    val str = readLine()!!.toLowerCase()
    for (i in 0 until str.length) {
        println(str[i])
    }
}