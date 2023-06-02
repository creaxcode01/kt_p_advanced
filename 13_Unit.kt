

// If a function does not return any useful value, its return type is Unit. Unit is a type with only one value — Unit.VALUE. This value does not have to be returned explicitly:

// une fonction qui ne retourne rien est du type Unit


fun printlnn() {   // dans ce cas le :Unit est juste masqué
    println("cette fonction ne retourne rien")
}


// la fonction au dessus est exactement la même chose que la fonction en-dessous

fun printlnnn() :Unit {
    println("cette fonction ne retourne rien non plus")
}


fun main() {
    printlnn()
    printlnnn()
}