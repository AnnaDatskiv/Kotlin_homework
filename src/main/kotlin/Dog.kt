class Dog(species:String, age:Int, weight:Float):Animal(species, age, weight) {
    override val ClassOfAnimals: String = "mammals"
    fun sleep(minutes: Int){
        println("собака спит")
    }
}