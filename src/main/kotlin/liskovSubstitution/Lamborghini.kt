package liskovSubstitution

class Lamborghini : Car() {

    override fun revEngine() {
        println("revving Lamborghini engine...")
    }

    override fun forward() {
        println("Lamborghini is moving forward...")
    }

    override fun backwards() {
        println("Lamborghini is moving backwards...")
    }

}