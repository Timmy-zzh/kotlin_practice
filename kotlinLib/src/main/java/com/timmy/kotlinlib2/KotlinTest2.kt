package com.timmy.kotlinlib2

import com.timmy.kotlinlib.sum3
import com.timmy.kotlinlib.sum2


fun main(args:Array<String>){
    println("hello kotlin -----")
    KotlinTest("timmy 1112").greet()

    //调用其他文件的方法
    println(sum2(1,2))
}

/**
 * 定义一个类和方法
 */
class KotlinTest(val name:String) {
    fun greet(){
        println("hello , $name")
    }
}