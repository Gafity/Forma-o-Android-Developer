package colecoes

fun main() {
    val numbers = listOf(1, -2, 3, 4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative numbers: $negatives")

    val numbers2 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers2.map { x -> x * 2}
    val triple = numbers.map{it * 3}
    println(doubled)
    println(triple)
}