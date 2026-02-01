package com.my.demo

fun String.isValidEmail(): Boolean {
    if(this.isEmpty()) return false

    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    return this.matches(emailRegex.toRegex())
}