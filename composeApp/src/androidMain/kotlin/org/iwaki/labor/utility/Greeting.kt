package org.iwaki.labor.utility

import org.iwaki.labor.utility.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String = "Hello, ${platform.name}!"
}

