package dev.hir05o1.news_tts_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform