package com.example.testingui

class MyCalcClass {

    fun sum3(a:Int, b:Int, c:Int):Int {
        return a+b+c
    }

    fun divide (a: Int, b: Int):Double {
        require( b!=0)
        return a/b.toDouble()
    }

    fun percent (a: Int, proc :Int):Int{
        return (a*proc/100)
    }

    fun sqrt(a:Double):Double {
        return Math.sqrt(a)
    }

    fun squaring(a:Double) :Double {
        return Math.pow(a,2.0)
    }

}