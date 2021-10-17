
fun main() {
    val firstdolphin = Dolphin ("killer whale", 3, 5.0f)
    println("возраст дельфина ${firstdolphin.age} года")
    println(if (firstdolphin.age<3) "должен плыть в присутствии взрослых" else "может плыть самостоятельно")


    val firstdog = Dog ("labrador", 2, 3.0f)
    firstdog.sleep(30)
    println("порода ${firstdog.species}, возраст ${firstdog.age} года, вес ${firstdog.weight} кг")
    println(if (firstdog.age<2) "еще не умеет гавкать" else "может гавкать")


    val firstbird = Bird("crow", 2, 0.5f)
    val secondbird = Bird("pigeon", 1, 0.3f)
    val thirdbird = Bird("woodpecker", 1, 0.4f)
    val array = arrayOf(firstbird.species.toString(), secondbird.species.toString(), thirdbird.species.toString())
    println(array.joinToString(", "))




    fun fibonachi(n:Int) {
        var a = 1
        var b = 1
        var c = 0
        for (i in 1..n) {
            val c = a
            a += b
            b = c
            print("$a ")
        }
    }
    fibonachi(10)
}