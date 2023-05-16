

/*


A nested class is a class defined within another class. For example, let’s say in the app of the Little Lemon restaurant you have a class Order. This class can have a nested class DeliveryDetails to store information such as a delivery address, delivery fee and so forth.

Note: In this example, Order is the outer class.



 */



class Order {  // Outer class
    val orderId = 1 

    class DeliveryDetails {  // Nested class, that means a class in a class (and static)
        val orderId = 1 
        val deliveryFeeInDollars = 10 
    } 

} 



fun main() {                                            // statique
println(Order.DeliveryDetails().deliveryFeeInDollars)  // How to acces to the nested class
                                                        // nested class is static by default
                                                        // doesn't need an instance
                                        
println(Order().orderId) // non statique

}
