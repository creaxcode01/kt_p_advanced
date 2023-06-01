/*

Générique veut dire que n'importe quelle type peut être placé à la place d'une fonction générique <T> cela peut être un Int, Un String ou tout autre type





 */





// 1 classe avec des "types classiques"


class Car(year: Int) {
    var year: Int = year
    init {                      // The code inside the init block is the first to be executed when the class is instantiated
        this.year = year        // nouvelle affectation de valeur this = à la argument passer dans le paramètre
        
    }

}





// 2 classe avec des "types génériques"

class Carr<T> (year: T) {       // <T> could be anything a string, an Integer
    var year: T = year        // <T> is a convention it could be <X> or <Y>
    init {                      
        this.year = year        
        
    }

}





fun main() {

       // classe classique


        var ageInt: Car = Car(2010) // ageInt est assigner à Car avec un argument 2010 (Int)

    println(ageInt.year)



     // classe générique


    var ageIntt: Carr<Int> = Carr(2015)     // instanciation d'une méthode avec argument générique
    var ageString :Carr<String> = Carr("2016")   // instanciation d'une méthode avec argument générique
    var ageBoolean :Carr<Boolean> = Carr(false)

    var ageIntTwo = Carr(2038)
    




    println(ageIntt.year)

    println(ageString.year)

    println(ageBoolean.year)

    println(ageIntTwo.year)




}
