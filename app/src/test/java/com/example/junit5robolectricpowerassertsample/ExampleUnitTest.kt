package com.example.junit5robolectricpowerassertsample

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    @DisplayName("デフォルトで用意されてるexampleテスト")
    fun addition_isCorrect() {
        assert(4 == 2 + 2)
    }
}