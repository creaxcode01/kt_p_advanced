


fun main() {



val listOfNumbers = listOf(1,2,3) // ceci est une liste de type :Int ( List<Int>)


println(listOfNumbers)


// for-loop

for (numberrr in listOfNumbers) {

    println()
    println(numberrr)


}


// Getting size of a list 

println(listOfNumbers.size)


// accessing elements of a list

println(listOfNumbers[0])
println(listOfNumbers[2])



// create a map


val studentRollNoToScoreMap = mapOf(

    1 to 93,  // 1 = key, 93 =value

    2 to 96,

    3 to 78,

    4 to 81,

    5 to 93, 


)


// iterate over a map for-loop

for (entryyy in studentRollNoToScoreMap) {
    println("${entryyy.key}=${entryyy.value}")
}






}