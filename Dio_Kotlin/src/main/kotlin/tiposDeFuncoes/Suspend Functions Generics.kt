package tiposDeFuncoes

/**
 * Exemplo básico de uma [suspend] function com Coroutines.
 * @see [Coroutines basics](https://kotlinlang.org/docs/coroutines-basics.html)
 */

import kotlinx.coroutines.*

fun main() = runBlocking{
    doWorld()
}

suspend fun doWorld() = coroutinescope{
    luauch{
        delay(1000L)
        println("World")
    }
    print("Hello")
}