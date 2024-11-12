@file:JvmName("Range")

fun main() {
    val number = 1
    for(number in 1 until 10){
        print(number)
        print(" ")
    }

    println()

    for(number in 1..10){
        print(number)
        print(" ")
    }
}