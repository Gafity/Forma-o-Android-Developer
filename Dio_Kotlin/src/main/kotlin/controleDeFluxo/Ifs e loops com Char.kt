package controleDeFluxo

fun main() {
    for (c in 'a'..'b'){
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2){
        print(c)
    }
    print(" ")

    val x = 2
    if (x in 1..5){
        print("x is in range from 1 to 5")
    }
    print(" ")

    if (x !in 6..10){
        print("x is not in range range from 6 to 10")
    }
}