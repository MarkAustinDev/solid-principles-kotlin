package interfaceSegregation

/**
 * Old interface that violated ISP as the interface was implemented by classes that couldn't functionally perform all
 * of the designed functionality.
 *
 *  * Old code that violated the ISP has been commented out to demonstrate example.
 */

//interface Robot {
//    fun goToLocation(lat: Double, long: Double)
//    fun wave()
//}

interface WavingRobot {
    fun wave()
}

interface MobileRobot {
    fun goToLocation(lat: Double, long: Double)

}
