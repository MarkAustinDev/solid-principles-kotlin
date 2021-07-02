package openClosed

/**
 * Using an interface to define the cars functionality enables sub classes to extend the functionality, but closes
 * the Car interface itself to modification.
 *
 */
interface Car {

    fun accelerate()

    fun brake()
}


/**
 * The below implementation of the original Car class is open to modification in order to extend the functionality
 * as there are specific functions for each type of car. This is bad design as a new function would have to be created
 * for every new car. The above solution.kt allows for an infinite number of subclasses to implement the interface and extend it.
 */
//class Car {
//
//    fun acceleratePorsche(){
//        println("The Porsche is accelerating...")
//
//    }
//
//    fun accelerateFerrari(){
//        println("The Ferrari is accelerating...")
//
//    }
//
//    fun brakePorsche(){
//        println("The Porsche is accelerating...")
//    }
//
//    fun brakeFerrari(){
//        println("The Porsche is accelerating...")
//    }
//}