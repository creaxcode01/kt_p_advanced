
object RestaurantTables {

    
    val customers: MutableList<String> = mutableListOf() // mutableListOf() is an instance

    fun addCustomer(customer: String) {
        customers.add(customer) // customer est le paramètre du constructeur
    }



    fun removeCustomer(customer: String) {
        customers.remove(customer)
    }
    

}





fun main() {
    RestaurantTables.addCustomer("Georges") // it doesn't to be RestaurantTables().addCustomer("Georges") because it's not an instance
    RestaurantTables.addCustomer("Lisa")
    RestaurantTables.removeCustomer("Georges") 
}


