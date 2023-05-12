class Waiter : Personnel { // it's a class inherits from Personnel (interface)



    var id: Int = -1
    var name: String = ""





    override fun serveCustomer() {
        TODO("Not yet implemented")
    }
                                     
                                     // the companion object and its scope is static
                                     // only one companion object is allowed per class
companion object Registration  {     // coding convention -> you have to put companion objects in the bottom of the class

                                         // A companion object is initialized when you instantiate the class for the first time.
                                         // Registration or any companion object name isn't mandatory
    var branchName: String = ""
    var branchAdress: String = ""

}



}