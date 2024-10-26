

fun main() {
    print("Strategy Pattern")
    val duckContext = DuckContext(FlyWithWingStrategy(), QuackWithDefaultStrategy())
    print (duckContext.display())
}