@file:JvmName("Loops")

fun main(args: Array<String>) {
    var i:Int = 1
    var j:Int = 15
    while(i<=10){
        println(j*i)
        i++
    }
    i=1
    j=1
    for(i in 1..20){
        for(j in 1..20){
            println("${i} X ${j} = "+(i*j))
        }
        println()
    }
}