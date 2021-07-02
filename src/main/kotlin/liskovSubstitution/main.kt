package liskovSubstitution


fun main() {
    val ferrari = Ferrari()
    val lambo = Lamborghini()
    val toyPorsche = ToyPorsche()

    ferrari.forward()
    ferrari.backwards()
    ferrari.revEngine()

    lambo.forward()
    lambo.backwards()
    lambo.revEngine()


    // Implements toy car interface to avoid LSP violation which was originally seen when implementing the Car
    // interface as a toy does not have an engine to rev.
    toyPorsche.forward()
    toyPorsche.backwards()
}