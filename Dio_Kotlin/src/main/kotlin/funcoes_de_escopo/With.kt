package funcoes_de_escopo

class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 900)

    with(configuration){
        println("$host:$port")
    }

    // alternative:
    configuration.run{
        println("$host:$port")
    }

    println("${configuration.host} : ${configuration.port}")
}