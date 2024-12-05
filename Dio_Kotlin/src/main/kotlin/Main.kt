fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun multiply(x: Int, y: Int) = x * y



fun main(args: Array<String>) {
    println("Hello World!")
    printMessage("Hello")
    printMessageWithPrefix("Olá", "log")
    printMessageWithPrefix("Olá, de novo")
    printMessageWithPrefix(prefix = "log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
    printMessageWithPrefix(message = "com info")
}