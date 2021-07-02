package singleResponsibility

/**
 * Abstract class vehicle that is the base/super class for sub classes that inherit from this class.
 *
 * In terms of SRP, the vehicle class has a single responsibility of dealing with its own basic functions. The vehicle
 * is only responsible for starting and stopping the engine
 * */
abstract class Vehicle {

    abstract var make: String
    abstract var model: String
    open var engineSize: Double? = null

     fun startEngine(){
         println("The $engineSize engine of the $model has been started. you're ready to go!\n")
     }

     fun stopEngine(){
         println("The $engineSize engine of the $model has been stopped.\n")
     }
}
