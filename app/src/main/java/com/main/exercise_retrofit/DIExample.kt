package com.main.exercise_retrofit

fun main(){
    var mesinBensinKu = GasolineEngine()
    //Constructor Injection
//    var mobilListrikKu = Car(mesinBensinKu)

    //Setter Injection
    var mobilListrikKu = Car()
    mobilListrikKu.engine = mesinBensinKu
    mobilListrikKu.startEngine()
}

//dependency injection : Constructor Injection
// tidak ada batasan solusi hanya menggunakan Inheritance
// boleh menggunakan solusi interface, abstract

// DI: Constrac Injection Setter Injection

class Car(var engine: Engine? = null){
    fun startEngine(){
        engine?.start()
    }
}

//Constructor Injection
//class Car(var engine: Engine){
//
//
//}
abstract class Engine{
    open fun start(){}
}

class GasolineEngine: Engine(){
    override fun start(){
        println("Mesin Bensin Nyala")
    }
}