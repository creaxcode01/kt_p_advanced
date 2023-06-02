// paradigme de programmation fonctionnelle

// une fonction d'ordre de supérieur est une fonction qui prendre en paramètre une ou des fonction /ou/ qui retourne une fonction


data class Personne (
        val nom: String = "Louis",
        val postnom: String = "Musole"
    )



                            
fun dePersonne(personne: Personne, fn : (String) -> Unit) { // fonction d'ordre supérieur car fonction qui prend en paramètre une autre fonction (fn)
    fn(personne.nom)                                       // :Unit permet de ne rien retourner dans une fonction
}



fun recupererNom(nom: String) {
    println(nom)
}
    


fun main() {
    val personne1 = Personne() // instaciation (objet) de la data classe Personne

    val personne2 = Personne()

    dePersonne(personne1, ::recupererNom)  // :: permet de faire référence à une fonction ou une classe

    dePersonne(personne2, {nomm -> recupererNom(nomm)})
}
