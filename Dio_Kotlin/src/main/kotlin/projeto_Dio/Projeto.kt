package projeto_Dio

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    // Função para matricular um usuário
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome.")
    }

    // Exibe os inscritos na formação
    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}

fun main() {
    // Criando conteúdos educacionais
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 120)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 180)
    val arquiteturaAndroid = ConteudoEducacional("Arquitetura Android", 150)

    // Criando formações
    val formacaoKotlin = Formacao("Desenvolvimento Kotlin", listOf(kotlinBasico, kotlinAvancado))
    val formacaoAndroid = Formacao("Desenvolvimento Android", listOf(arquiteturaAndroid))

    // Criando usuários
    val usuario1 = Usuario("Gabriel")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("João")

    // Matriculando usuários
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoAndroid.matricular(usuario3)

    // Listando inscritos
    formacaoKotlin.listarInscritos()
    formacaoAndroid.listarInscritos()

    // Exibindo os conteúdos de uma formação
    println("\nConteúdos da formação ${formacaoKotlin.nome}:")
    formacaoKotlin.conteudos.forEach {
        println("- ${it.nome}, duração: ${it.duracao} minutos")
    }
}
