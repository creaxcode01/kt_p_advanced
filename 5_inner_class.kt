// an inner is a nested class that should be able to access members of the outer class

class Order(val orderAmount: Int) { 

    inner class TaxDetails { 
        val taxAmount = 0.05 * orderAmount 
    } 

} 

// Create instance of Order with amount 100 
val order = Order(100)		 

// Create instance of TaxDetails using the instance of Order class  
val taxDetails = order.TaxDetails() 

// Print the tax amount equal to 5 
println(taxDetails.taxAmount) 