package singleResponsibility

/**
 * The car wash class has a single responsibility of washing cars.
 */
class CarWash {

    fun wash(car: Car){
        println("${car.make} ${car.model} has been washed.")
    }
}