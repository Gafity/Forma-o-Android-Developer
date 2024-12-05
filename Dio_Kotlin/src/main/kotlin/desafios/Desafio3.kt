package desafios

data class Pais(val habitantes: Double, val taxaCrescimento: Double) {
    var habitantesAtuais = habitantes

    fun crescerPopulacaoAnual() {
        // Atualiza a população com base na taxa de crescimento
        habitantesAtuais += habitantesAtuais * (taxaCrescimento / 100)
    }
}

fun main() {
    // Lê os habitantes iniciais de cada país
    val habitantesPaisA = readLine()!!.toDouble()
    val habitantesPaisB = readLine()!!.toDouble()

    // Instancia os países com suas respectivas taxas de crescimento
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0

    // Loop para calcular o tempo até que a população de A ultrapasse B
    while (paisA.habitantesAtuais < paisB.habitantesAtuais) {
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}
