fun someCandition() = true

fun main() {
    var a: String = "initial" // Var são variaveis mutaveis
    println(a)
    a = "Final"
    println(a)
    val b: Int = 1 // Val são variaveis imutaveis
    val c = 3
    println(b)
    println(c)

    val d: Int

    if (someCandition()){
        d = 1
    } else {
        d = 2
    }

    println(d)
}