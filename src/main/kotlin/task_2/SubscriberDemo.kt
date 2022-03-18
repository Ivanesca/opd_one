import task_2.CountDown
import task_2.Subscriber

fun main() {
    val timer = CountDown()
    var index = 0
    var delay: Long
    while (true) {
        println("1 - Создать нового подписчика")
        println("2 - Установить таймер для рассылки")
        when(readLine()) {
            "1" -> timer.subscribe(Subscriber("Subscriber - ${index++}"))
            "2" -> {
                print("Введите длительность(мс): ")
                delay = readLine()?.toLongOrNull() ?: 0
                timer.timer(delay)
            }
        }
        println()
    }
}