
/*
kotlinc *.kt -include-runtime -d Client.jar && java -jar Client.jar 
*/

fun main() {
    println("Strategy Pattern")
    val duckContext = DuckContext(FlyWithWingStrategy(), QuackWithDefaultStrategy())
    print (duckContext.display())
}