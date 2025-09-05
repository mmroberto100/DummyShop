package com.mmunoz.dummyshop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform