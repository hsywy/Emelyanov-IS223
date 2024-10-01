//Практическая работа 8.5
//Емельянов Иван ИС223
fun checkBet(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    // Пример использования функции
    val prob = 0.25  // вероятность
    val prize = 100.0 // приз
    val pay = 20.0   // ставка

    val result = checkBet(prob, prize, pay)
    println("Результат: $result") // Вывод: Результат: true или false
}