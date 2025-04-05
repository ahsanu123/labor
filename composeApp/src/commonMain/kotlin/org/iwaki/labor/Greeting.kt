package org.iwaki.labor

import daysPhrase

class Greeting {
    @Suppress("INVISIBLE_REFERENCE", "OVERLOAD_RESOLUTION_AMBIGUITY")
    private val platform = getPlatform()

    fun greet(): List<String> {
        val greetWords =
            buildList {
                add("Hi!, ")
                add("Run on ${platform.name}")
                add(daysPhrase())
            }
        return greetWords
    }
}
