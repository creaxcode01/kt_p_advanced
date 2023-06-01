


fun main () {


// val myLambdaFuncOne = {x, y -> x + y}    // lambda dans sa forme la plus simple




val myLambdaFuncTwo : (Int, Int) -> Int = {x, y      ->      x + y}
                       // signature       // parameters      // method body


println(myLambdaFuncTwo(1,3))


}