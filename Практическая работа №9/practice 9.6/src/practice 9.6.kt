//Практическая работа 9.6
//Емельянов Иван ИС223
fun main() {
    val arr = arrayOf("hello", "world", "kotlin", "is", "fun")

    println("Unsorted array: ${arr.contentToString()}")
    println("Sorted array: ${sortStrings(arr).contentToString()}")
}

fun sortStrings(arr: Array<String>): Array<String> {
    return arr.sortedArray()
}
