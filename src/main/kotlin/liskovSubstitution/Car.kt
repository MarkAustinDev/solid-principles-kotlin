package liskovSubstitution

// Base class that applies to both real and toy cars
abstract class ToyCar {
    abstract fun forward()
    abstract fun backwards()
}


// Specific base class for real cars that implements all of the shared functionality from the ToyCar base class and
// additonal functionality that is specific to real cars.
abstract class Car: ToyCar() {
    abstract fun revEngine()
}

/**
 * The old implementation has been commented out that demonstrates the LSP violation.
 */
//abstract class Car {
//    abstract fun revEngine()  - Violates LSP as the ToyPorsche was implementing this base class and its not possible for a toy car to rev an engine.
//    abstract fun forward()
//    abstract fun backwards()
//}
//
