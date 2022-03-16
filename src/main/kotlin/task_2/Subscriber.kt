package task_2

class Subscriber(private val name: String) : EventListener {
    override fun update(message: String) {
        println("$message - $name")
    }
}