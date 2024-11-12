@file:JvmName("Function")

fun main(args: Array<String>) {
   println(multiplication(20,45))
    println(divide(23.5,45.8))
}

fun multiplication(x: Int, y: Int): Int{
    return x*y
}

fun divide(vararg args: Any): Double {
    // Ensure we have exactly two arguments and they are numbers
    if (args.size < 2) {
        throw IllegalArgumentException("At least two arguments are required")
    }

    // Check that the arguments are numbers
    val num1 = args[0] as? Number ?: throw IllegalArgumentException("First argument is not a number")
    val num2 = args[1] as? Number ?: throw IllegalArgumentException("Second argument is not a number")

    // Perform the division
    if (num2.toDouble() == 0.0) {
        throw ArithmeticException("Cannot divide by zero")
    }

    // Return the result of division as Double
    return num1.toDouble() / num2.toDouble()
}

