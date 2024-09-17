//Практическая работа 3.8
//Емельянов Иван ИС223
fun main() {
    println("Введите расстояние в километрах:")
    val distanceKm = readLine()?.toDoubleOrNull() ?: 0.0
    println("Введите расстояние в футах:")
    val distanceFt = readLine()?.toDoubleOrNull() ?: 0.0

    val distanceM = distanceFt * 0.305 // Перевод футов в метры
    val distanceKmToM = distanceKm * 1000 // Перевод километров в метры

    if (distanceKmToM < distanceM) {
        println("Расстояние в километрах меньше")
    } else if (distanceKmToM > distanceM) {
        println("Расстояние в футах меньше")
    } else {
        println("Расстояния равны")
    }
}