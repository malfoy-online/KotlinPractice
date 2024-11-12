@file:JvmName("String")

fun main() {
    var argument: Int = 0
    var message:String = if((argument%2 == 0) && (argument != 0)){
        "even"
    }else if((argument%2 != 0) && (argument != 0)){
        "odd"
    }else{
        "neither odd nor even"
    }
    println(message)

    var choice = 6
    message = if(choice in 1..5){
        "in range"
    }else{
        "out of range"
    }
    println(message)
}