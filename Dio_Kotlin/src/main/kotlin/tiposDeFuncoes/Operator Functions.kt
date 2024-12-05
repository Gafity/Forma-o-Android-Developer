package tiposDeFuncoes

fun main(){
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies: nothing annoyes them so much."
    println(str[0..14])
}
