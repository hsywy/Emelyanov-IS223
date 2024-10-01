//Практическая работа 8.9
//Емельянов Иван ИС223
fun isKPowerKEqualN(n: Int, k: Int): Boolean {
    // Если k меньше 0 или n меньше 0, возвращаем False
    if (k < 0 || n < 0) return false

    // Вычисляем k^k
    val kPowerK = k.toDouble().pow(k).toInt()

    // Сравниваем k^k с n
    return kPowerK == n
}

fun main() {
    // Пример использования функции
    val n = 27
    val k = 3

    val result = isKPowerKEqualN(n, k)
    println("Равно ли $k^$k = $n: $result") // Вывод: Равно ли 3^3 = 27: true или false
}