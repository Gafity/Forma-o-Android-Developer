fun main() {
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "Olá")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "Olá", prefix = "Greeting")

    fun log(vararg entries: String) {
        printAll(*entries) // Se uma função que também é um vararg estiver chamando outra função
        // com parametros, seu argumento precisa ser passado junto com "*" para específica que você está passando
        // um vararg e não um array.
    }
    log("Hello", "Hallo", "Salut", "Hola", "Olá")
}