package com.github.mkorman9

private const val CHARS: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"

fun randomPayload(n: Int): String {
    return (0 ..< n)
        .map { CHARS[(Math.random() * CHARS.length).toInt()] }
        .joinToString("")
}
