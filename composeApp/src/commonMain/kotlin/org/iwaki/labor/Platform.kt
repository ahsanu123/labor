package org.iwaki.labor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

