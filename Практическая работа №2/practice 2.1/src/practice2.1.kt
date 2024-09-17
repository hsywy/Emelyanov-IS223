//Практическая работа 2.1
//Емельянов Иван ИС223
fun main() {
    // Вводим двузначное число
    val number = 67

    // Извлекаем десятки и единицы
    val tens = number / 10
    val units = number % 10

    // Рассчитываем сумму и произведение цифр
    val sum = tens + units
    val product = tens * units

    // Выводим результаты
    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")
}