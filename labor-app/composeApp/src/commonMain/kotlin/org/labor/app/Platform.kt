package org.labor.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform