package poo

import java.util.Random

fun rentPrice(standardDays: Int, festivityDays: Int, specialdays: Int): Unit {

    val dayRates = object {
        var standard: Int = 3 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialdays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price: $$total")
}

class LuckDispatcher {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

object DoAuth{
    fun takesParams(username: String, password: String){
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    companion object Bonger { //metodo estatico
        fun getBongs(nTimes: Int){
            for (i in 1..nTimes){
                println("BONG")
            }
        }
    }
}

fun main() {
    rentPrice(10,2,1 )
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    DoAuth.takesParams("foo", "qwerty")

    BigBen.getBongs(12)
}