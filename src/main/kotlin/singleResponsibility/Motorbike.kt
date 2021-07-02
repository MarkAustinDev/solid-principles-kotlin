package singleResponsibility

/**
 * The motorbike data class has a single responsibility of providing specific data regarding the motorbike.
 */
data class Motorbike(
    override var make: String,
    override var model: String,
    override var engineSize: Double?
) : Vehicle()