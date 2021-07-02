package singleResponsibility

fun main() {
    val mazda = Car("mazda", "mx5", 1.5)
    val ducati = Motorbike("Ducati", "Superbike", 2.0)
    val carWash = CarWash()
    val driver = Driver()

    carWash.wash(mazda)
    mazda.startEngine()
    driver.drive(mazda)
    driver.park(mazda)
    mazda.stopEngine()
    mazda.openBoot()
    mazda.closeBoot()


    ducati.startEngine()
    driver.drive(ducati)
    driver.park(ducati)
    ducati.stopEngine()

}