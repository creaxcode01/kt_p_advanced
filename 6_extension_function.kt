/* une extension de fonction étend une classe/fonction déja présente

 An extension function allows programmers to add functionality without inheriting from existing classes.

une extension de fonction ne peut pas avoir accès au attributs private d'une classe
une extension de fonction est statique et ne prend pas en compte l'héritage de de la classe mère

 */






// fonction main (principale)

fun main () {

    val age: Int = 30
    val result: Int = age.somme(15) // utilisation de l'extension de fonction


    
    val textt :String = "Hello"


    println(result)
    
    println(textt.removeLastandFirst()) // utilisation de l'extension de fonction

 

}



// fonction qui étend Int


                                          // extension de fonction, on extense la fonction Int 
fun Int.somme(nombre: Int) : Int  {       // "extenser" le type Int avec une fonction qui s'appelle somme()
    return this + nombre // this retourne la valeur de l'int actuel(exemple : age.somme) + nombre(argument)


} 


// fonction qui étend String

fun String.removeLastandFirst() :String { // fonction qui supprime la première et la dernière lettre d'un mot
    return this.substring(1, this.length -1) // this retourne la valeur de la chaîne de caractères actuelle
}                            // substring est une fonction String pré-éxistante


// appeller une extension de fonction 

fun main {

println(age.somme(15))

println(textt.removeLastandFirst()) // utilisation de l'extension de fonction
}