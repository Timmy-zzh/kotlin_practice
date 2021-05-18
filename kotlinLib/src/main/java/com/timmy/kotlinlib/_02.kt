package com.timmy.kotlinlib

fun main(args: Array<String>) {
    println("-----------基本数据类型------------")
    dataType()

}

/**
 * 1.基本数据类型：
 * - kotlin 基本数值类型包括：Byte，Short，Int，Long，Float，Double
 * --字符不属于数值类型，是一个独立的数据类型
 */
fun dataType() {
    val a = 1_000_000
    val b = 1234_4567_0989
    val c = 199999_999L
    // 16进制
    val hex = 0XFF_AB;
    // 二进制
    val bytes = 0b11010010_1001;
}
