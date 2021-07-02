package liskovSubstitution

class Ferrari : Car(){

    override fun revEngine() {
        println("revving Ferrari engine...")
    }

    override fun forward() {
        println("Ferrari is moving forward...")
    }

    override fun backwards() {
        println("Ferrari is moving backwards...")
    }

}