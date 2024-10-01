//Практическая работа 5.3
//Емельянов Иван ИС223
fun main(){
    print("введите число N ")
    val n = readLine()!!.toInt()
    var sum = 0
    for(i in 1..n){
        sum+=1
    }
    println("сумма чисел от 1 до $n: $sum")
}