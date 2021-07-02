package singleResponsibility

/**
 * The driver class has a single responsibility of driving and parking whichever vehicle the driver decides to use.
 * Its up to the driver to decide which vehicle they want to use.
 */
class Driver {

    //Examples of function overloading to provide the same fuctionality for different object types.
    fun drive(car: Car) {
        println("You're now driving a ${car.make} with a ${car.engineSize} engine")
    }

    fun park(car: Car) {
        println("You have parked the ${car.make} ${car.model } ")
    }

    fun drive(motorbike: Motorbike) {
        println("You're now driving a ${motorbike.make} with a ${motorbike.engineSize} engine")
    }

    fun park(motorbike: Motorbike) {
        println("You have parked the ${motorbike.make} ${motorbike.model } ")
    }
}