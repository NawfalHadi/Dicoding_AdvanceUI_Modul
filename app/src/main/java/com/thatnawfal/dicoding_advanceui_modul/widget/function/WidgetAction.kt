package com.thatnawfal.dicoding_advanceui_modul.widget.function

import java.util.*


internal object WidgetAction {
    fun generateNumber(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}