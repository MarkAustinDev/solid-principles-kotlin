package interfaceSegregation

fun main(){

    val movingRobot = MovingRobot()
    val stationaryRobot = StationaryRobot()

    movingRobot.goToLocation(100.23, 200.78)
    movingRobot.wave()

    stationaryRobot.wave()
}