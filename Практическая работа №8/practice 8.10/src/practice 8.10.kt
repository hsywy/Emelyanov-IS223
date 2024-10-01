//Практическая работа 8.10
//Емельянов Иван ИС223
fun repeatString(txt: String, n: Int): String {
    // Базовый случай: если количество повторений меньше или равно нулю, возвращаем пустую строку
    if (n <= 0) return ""

    // Рекурсивный случай: возвращаем строку txt, добавленную к повторенному тексту
    return txt + repeatString(txt, n - 1)
}

fun main() {
    // Пример использования функции
    val txt = "hello"
    val n = 3

    val result = repeatString(txt, n)
    println("Повторенная строка: $result") // Вывод: hellohellohello
}