package com.timmy.kotlinlib

fun main(args: Array<String>) {
    println("-----------基本数据类型------------")
//    dataType()
    arrMethod()

}

fun arrMethod() {
    println("--数组 Arrays--")
    //创建方式1：使用arrayOf一个数组
    val a = arrayOf(1, 2, 3)
    println(a)
    for (item in a) {
        println(item)
    }

    //创建方式2：使用工厂函数创建一个数组
    val b = Array(3, { i -> (i * 2) })
    println(b)
    for (item in b) {
        println(item)
    }
}

/**
 * 1.基本数据类型：
 * - kotlin 基本数值类型包括：Byte，Short，Int，Long，Float，Double
 * --字符char不属于数值类型，是一个独立的数据类型
 * -类型转换
 */
fun dataType() {
    val aa = 1_000_000
    val b = 1234_4567_0989
    val c = 199999_999L
    // 16进制
    val hex = 0XFF_AB;
    // 二进制
    val bytes = 0b11010010_1001;

    var al = aa.toLong()
    println(aa)
    println(al)

    println("--Char--")
    //字符类型
    val ch: Char = '1'
    println(ch)
    val toInt = ch.toInt()
    println(toInt)


    println("--String--")
    var a = 1;
    val s1 = "a is $a"
    println(s1)
    a = 2;
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)
}
