package dependencyInversion;


/**
 * To fix the Dependency Inversion violation, we've implemented an abstraction for the DrinksBot class in the form of
 * an interface. The higher level class DrinksBot now is decoupled from the lower level classes BeerBot and WineBot
 * and doesn't have any dependencies on the lower level classes.
 *
 * We can now extend the higher level interface without impacting the lower level classes and their functionality.
 * This is also using the Open-Closed Principle (OCP).
 */
interface DrinksBot {
    fun dispense()
}

class BeerBotFixed : DrinksBot {
    override fun dispense() {
        println("Dispensing 🍺")
    }
}

class WineBotFixed : DrinksBot {
    override fun dispense() {
        println("Dispensing 🍷")
    }
}