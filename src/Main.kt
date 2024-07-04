
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main() {

    askCoffeeDetails()

    /*val coffeeForMohsin = CoffeeDetails(0, "Mohsin", "M", 0)
    makeCoffee(coffeeForMohsin)*/
}

fun askCoffeeDetails(){
    println("Who is this Coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()
    println("Size of Coffee? S, M, L, XL")
    val size = readln()
    println("Amount of Cream?")
    val creamAmount = readln().toInt()

    val coffeeDetails = CoffeeDetails(sugarCount, name, size, creamAmount)
    makeCoffee(coffeeDetails)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} with add ${coffeeDetails.creamAmount} amount of cream")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name} with add ${coffeeDetails.creamAmount} amount of cream")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} with add ${coffeeDetails.creamAmount} amount of cream")
    }
}