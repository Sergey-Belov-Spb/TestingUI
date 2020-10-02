package com.example.testingui

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException

class  MyCalcClassTest {
    @Test
    fun isAdditionCorrect(){
        log("isAdditionCorrect")
        Assert.assertEquals(4,myCalcClass?.sum3(2,1,1))
    }

    @Test
    fun isAdditionCorrect2(){
        log("isAdditionCorrect")
        Assert.assertEquals(9,myCalcClass?.sum3(10,0,-1))
    }

    @Test (expected = IllegalArgumentException::class)
    fun isDivisionCorrectZero(){
        log("isDivisionCorrectZero")
        Assert.assertEquals(0.0, myCalcClass?.divide(4, 0))
    }
    @Test
    fun isDivisionCorrect(){
        log ("isDivisionCorrect")
        Assert.assertEquals(4.0, myCalcClass?.divide(4,1))
    }
    @Test
    fun checkProcent1 (){
        log("checkProcent1")
        Assert.assertEquals(100,myCalcClass?.percent(500,20))
    }

    @Test
    fun checkSqrt_1 (){
        log("checkSqrt_1")
        Assert.assertEquals(3.0,myCalcClass?.sqrt(9.0))
    }

    @Test
    fun checkSquaring_1 (){
        log("checkSquaring_1")
        Assert.assertEquals(64.0,myCalcClass?.squaring(8.0))
    }


    companion object {
        fun log(input: String) {
            System.out.println(input)
        }
    }
    private var myCalcClass : MyCalcClass? = null

    @Before
    fun setUp(){
        log("setUp")
        myCalcClass = MyCalcClass()
    }
    @After
    fun endTest(){
        log("endTest")
        myCalcClass = null
    }

}