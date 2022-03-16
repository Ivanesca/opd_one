package task_2

import io.mockk.spyk
import io.mockk.verify
import kotlin.test.Test

class SubscriberTest {
    private val subscriber1: Subscriber = spyk(Subscriber("First"))
    private val subscriber2: Subscriber = spyk(Subscriber("Second"))

    private val timer: CountDown = CountDown()

    @Test
    fun `Subscribe and unsubscribe test`() {
        timer.subscribe(subscriber1)
        timer.subscribe(subscriber2)
        timer.timer(0)
        timer.unsubscribe(subscriber2)
        timer.timer(100)

        verify(exactly = 2) { subscriber1.update(any()) }
        verify(exactly = 1) { subscriber2.update(any()) }
    }
}