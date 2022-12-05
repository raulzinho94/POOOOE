package com.example.poo_ooe

class SubClasses {
    private var name = "Padre"
    fun presentar(): String { return this.name }

    class Anidada{
        private val nameAnidada = "Anidada"
        fun presentar (): String { return this.nameAnidada }

    }

    inner class Interna{
        private val nameInterna = "interna"
        fun presentar(): String{ return "hola, soy ${this.nameInterna}, hija de ${name}"}
    }

}
