@file:JvmName("When")

fun main(args: Array<String>) {
    val animal: String = "Cow"

    val result = when(animal){
        "Dog" -> "Animal is a dog"
        "Cat" -> "Animal is a cat"
        "Tiger" -> "Animal is a tiger"
        "Lion" -> "Animal is a lion"
        else -> {
            "Animal selection is not correct"
        }
    }

    println(result)
}