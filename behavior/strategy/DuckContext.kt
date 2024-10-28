
class DuckContext {
    private val flyStrategy: FlyStrategy
    private val quackStrategy: QuackStrategy

    public constructor(flyStrategy: FlyStrategy, quackStrategy: QuackStrategy) {
        this.flyStrategy = flyStrategy
        this.quackStrategy = quackStrategy
    }

    private fun fly() {
        this.flyStrategy.fly()
    }

    private fun quack() {
        this.quackStrategy.quack()
    }

    fun display() {
        println("--------------------")
        println(" Show Duck ! ")
        this.fly()
        this.quack()
        println("--------------------")
    }
}