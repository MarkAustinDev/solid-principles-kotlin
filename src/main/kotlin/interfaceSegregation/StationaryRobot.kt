package interfaceSegregation

// class StationaryRobot: Robot {
class StationaryRobot: WavingRobot {

    /**
     * This function breaks the Interface Segregation Principle as a stationary robot cannot move and thus cannot go to
     * a location. The solution for this is to split the Robot interface into 2 separate client-specific interfaces.
     *
     * The StationaryRobot class would then implement the WavingRobot interface as that is
     * the only function it can perform.
     *
     * Old code that violated the ISP has been commented out to demonstrate example.
     */
//    override fun goToLocation(lat: Double, long: Double) {
//    }

    override fun wave() {
        println("Stationary robot says hello 👋")
    }
}