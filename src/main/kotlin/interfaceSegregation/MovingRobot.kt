package interfaceSegregation

/**
 * Old code that violated the ISP has been commented out to demonstrate example.
 */
//class MovingRobot : Robot {
class MovingRobot : WavingRobot, MobileRobot {

    override fun goToLocation(lat: Double, long: Double) {
        println("moving to coordinates ($lat, $long)")
    }

    override fun wave() {
        println("Moving robot says hi👋")
    }

}