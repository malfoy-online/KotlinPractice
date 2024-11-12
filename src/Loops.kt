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
    //by default the "step" of increment is 1
    for(i in 1..20){
        for(j in 1..20){
            println("${i} X ${j} = "+(i*j))
        }
        println()
    }

    //if the step is made more than 1
    for(i in 1..20 step 2){
        for(j in 1..20){
            println("${i} X ${j} = "+(i*j))
        }
        println()
    }

    //to make the upper bound not included
    for(i in 1 until 20){
        println(i)
    }

    //decrement range (1)
    for(i in 20 downTo 1){
        println(i)
    }


}