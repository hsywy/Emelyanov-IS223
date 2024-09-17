//Практическая работа 4.11
//Емельянов Иван ИС223
fun main() {
    print("Введите группу крови (A, B, AB, O): ")
    val bloodType = readLine()?.trim()?.uppercase() ?: return
    val compBloodTypes = when (bloodType) {
        "A" -> "A, O"
        "B" -> "B, O"
        "AB" -> "A, B, AB, O"
        "O" -> "O"
        else -> "Неизвестная группа крови"
    }

    println("Совместимые группы крови для переливания: $compBloodTypes")
}