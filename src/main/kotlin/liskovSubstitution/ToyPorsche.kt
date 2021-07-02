package liskovSubstitution

class ToyPorsche: ToyCar() {
// class ToyPorsche : Car() {

    /**
     * This method causes a violation of the Liskov Substitution Principle as we are implementing the base class Car
     * which MUST ensure we implement all methods.
     *
     * We can't implement revEngine() as the subclass ToyPorsche is referring to a toy car which does not have an engine.
     *
     * A solution to this issue would be to create another base class called ToyCar()
     * and define all methods for toy cars and not real cars. This subclass would then inherit from ToyCar() instead of
     * Car() (example outlined in Car class) and above.
     *
     * The old implementation has been commented out that demonstrates the LSP violation.
     */
//    override fun revEngine() {
//    }

    override fun forward() {
        println("Toy Porsche has been pushed forward...")
    }

    override fun backwards() {
        println("Toy Porsche has been pushed backward...")
    }

}