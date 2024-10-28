/*
얘도 추상클래스가 따로 있고 해당 추상클래스를 구현한 여러개의 Context가 있을 수 있다.
*/
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