package dependencyInversion


/**
 * The fixed beer and wine bots now implement the dispense function from the Interface RoboBot. This removes the
 * dependency inversion as the lower level beer and wine bot classes aren't impacting the higher level RoboBot interface.
 *
 * The dispense() function is now also applicable to both wine and beer bots without a specific function for each.
 * This follows the Open Closed Principle as the RoboBot interface is open for extension and closed for modification.
 */
fun main() {

    val oldBeerBot = BeerBot()
    val newBeerBot = BeerBotFixed()

    val oldWineBot = WineBot()
    val newWineBot = WineBotFixed()

    oldBeerBot.dispenseBeer()
    newBeerBot.dispense()

    oldWineBot.dispenseWine()
    newWineBot.dispense()
}