//Практическая работа 4.13
//Емельянов Иван ИС223
fun main() {
    print("Введите код ошибки (100, 200, 300): ")
    val errorCode = readLine()?.toIntOrNull() ?: return

    val errorMessage = when (errorCode) {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка доступа"
        400 -> "Неправильный запрос"
        500 -> "Внутренняя ошибка сервера"
        else -> "Неизвестный код ошибки"
    }

    println("Код ошибки $errorCode: $errorMessage")
}