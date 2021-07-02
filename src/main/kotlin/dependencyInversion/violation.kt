package dependencyInversion


/**
 * So what we have here is our higher level class RoboPub depending on our low level, concrete classes
 * WineBot and BeerBot, causing this class to violate the Dependency Inversion Principle. In addition to this,
 * dispenseBeer and dispenseWine are details coupled with their classes, meaning that we'd need to change this before
 * we add an abstraction. What if we want our pub to have robots that dispense other drinks? In its current state,
 * we’d have to change the RoboPub class, which violates the Open-Closed Principle.
 */
//Higher level class
class RoboPub {
    private val wineBot = WineBot()
    private val beerBot = BeerBot()

    fun dispenseDrinks(){
        wineBot.dispenseWine()
        beerBot.dispenseBeer()
    }
}


//Lower level class
class BeerBot {
    fun dispenseBeer() {
        println("Dispensing 🍺")
    }
}


//Lower level class
class WineBot {
    fun dispenseWine() {
        println("Dispensing 🍷")
    }
}
