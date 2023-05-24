class Dish (
    
    val dishName: String, //déclaration sans initialisation
    
    val ingredients: MutableList<String>,  //déclaration sans initialisation
 
)



fun Dish.printIngredients() { // extension de fonction
    println(ingredients)
}


fun Dish.removeSalt() { // extension de fonction
    ingredients.remove("Salt")
}


fun main() {
    
    val onionSoup = Dish("Onion Soup", mutableListOf("Onion","Cheese","Water","Salt")) // création d'une instance de la classe Dish
    onionSoup.removeSalt() // removeSalt() est une fonction de mutableListOf
    onionSoup.printIngredients()
     
}