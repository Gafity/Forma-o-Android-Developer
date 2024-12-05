fun describeString(maybeString: String?): String{
    if (maybeString != null && maybeString.length > 0){
       return "String of length ${maybeString}"
    } else{
        return "Empty or null string"
    }
}

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null
    var nullable: String? = "You can keep a null here"
    //Variaveis que podem ser nulas tem que ser passada explicidamente com o sinal de ?

    nullable = null
    var inferredNonNull = "The copiler assumes non-null"
    //inferredNonNull = null
    fun strLength(notNull: String): Int{
        return notNull.length
    }
}