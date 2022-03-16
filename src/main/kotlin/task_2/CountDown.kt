package task_2

class CountDown {
    private val listeners: MutableList<EventListener> = mutableListOf()

    fun subscribe(eventListener: EventListener) {
        listeners.add(eventListener)
    }

    fun unsubscribe(eventListener: EventListener) {
        listeners.remove(eventListener)
    }

    private fun notify(message: String) {
        for (listener in listeners) {
            listener.update(message)
        }
    }

    fun timer(millis: Long) {
        Thread.sleep(millis)
        notify("I did my waiting! $millis millis of it, in a Azkaban!")
    }
}