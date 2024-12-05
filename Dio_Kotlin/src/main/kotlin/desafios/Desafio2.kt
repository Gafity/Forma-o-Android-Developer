package desafios

fun main() {
    val numeroRomano: String? = readLine()

    // Mapeamento de números romanos para decimais
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun resultadoDecimal(str: String?): Int {
        // Verifique se a entrada não é nula
        if (str.isNullOrEmpty()) return 0

        var resultado = 0 // Variável para armazenar o resultado
        var anterior = 0  // Armazena o valor anterior para comparações

        for (decimal in str) {
            val atual = numerosRomanos[decimal] ?: 0 // Obtém o valor atual, padrão 0 se inválido
            if (atual > anterior) {
                // Subtrai o valor duplicado do anterior e adiciona a diferença
                resultado += atual - 2 * anterior
            } else {
                resultado += atual
            }
            anterior = atual // Atualiza o valor anterior
        }
        return resultado
    }

    // Chama a função e imprime o resultado
    println(resultadoDecimal(numeroRomano))
}
