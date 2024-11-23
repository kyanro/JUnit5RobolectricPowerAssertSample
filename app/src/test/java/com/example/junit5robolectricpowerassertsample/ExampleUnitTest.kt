package com.example.junit5robolectricpowerassertsample

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtendWith
import tech.apter.junit.jupiter.robolectric.RobolectricExtension
import kotlin.test.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExtendWith(RobolectricExtension::class)
class ExampleUnitTest {
    @Test
    @DisplayName("デフォルトで用意されてるexampleテスト")
    fun addition_isCorrect() {
        assert(4 == 2 + 2)
    }

    @Test
    @DisplayName("package名確認")
    fun checkPackageName() {
        val context: Context = ApplicationProvider.getApplicationContext()
        assert("com.example.junit5robolectricpowerassertsample" == context.packageName)
    }
}