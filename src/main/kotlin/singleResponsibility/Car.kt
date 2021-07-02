package singleResponsibility

/**
 * Sub class that inherits from the base abstract class Vehicle.
 *
 * The car wash class has a single responsibility of providing specific data regarding the car and also specific functionality
 * that doesn't apply to other vechicle classes such as a motorbike.
 */
class Car(
    override var make: String,
    override var model: String,
    override var engineSize: Double?
) : Vehicle(){

    fun openBoot(){
        println("The $model boot has been opened.")
    }

    fun closeBoot(){
        println("The $model boot has been closed.")
    }

}