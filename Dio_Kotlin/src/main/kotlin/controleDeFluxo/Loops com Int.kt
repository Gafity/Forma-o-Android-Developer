package controleDeFluxo

// x .. y, os dois ponto é para definir a onde é começõ e onde é o fim (x(inicio)..y(final)
// A saida é de x até y
fun main() {
    for (i in 0..3){
        print(i)
    }
    print(" ")

    // já o usando until o 3 não é mostrado como valor de saida, apenas x até y-1
    for(i in 0 until 3){
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2){
        print(i)
    }
    print(" ")

    // downTo é o decremento(y até x)
    for(i in 3 downTo 0){
        print(i)
    }
    print(" ")
}