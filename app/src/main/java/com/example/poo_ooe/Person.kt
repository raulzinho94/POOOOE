package com.example.poo_ooe

open class Person(var name: String = "Anonimo", var passport: String? = null, var height: Float= 1.6f) {
    var alive: Boolean = true

    fun Person(){
        name = "Juan"
        passport = "B45612824B"
    }

    fun die () {
        alive = false
    }
    fun checkPolicia(fn: (Float)->Boolean): Boolean {
        return fn(height)
    }
}
class Athlete(name: String, passport: String?, var sport: String): Person(name, passport)