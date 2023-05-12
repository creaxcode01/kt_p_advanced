/* Singleton est utilisé lorqu'il n'y a besoin que d'une seule instance d'un type d'object
par exemple pour le nom de son entreprise, comme ce sera toujours le même un single sera adapté la ou une classe sera superflue */

// a Singleton object can inherit another class or another interface


import java.util.*;

object Company {  // On utilise object pour un singleton et non pas class
    var companyName: String = "Little Lemon"
    var yearOpened: Int = 2019
    
    fun getTotalYearsOpen() : Int {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOpened
    }
}


/*

La principale différence dans l'utilisation de cette classe est que les fonctions et les propriétés seront accessibles de manière statique ; aucune instance de la classe ne peut être créée.

Par exemple, si vous vouliez imprimer le nombre d'années d'ouverture du Petit Citron, vous utiliseriez le code suivant :

 */

fun main() {


 println(Company.getTotalYearsOpen())

}
