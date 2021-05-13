package com.timmy.kotlinlib

//fun main() {
//    println("kotlin 基本语法学习 --")
//}

/**
 * 入口函数：带入参
 */
fun main(args: Array<String>) {
    println("-------------------method----------------------")
    val sum = sum(2, 3);
    println("sum: $sum")
    println(sum2(3, 4))
    println(sum3(4, 4))
    printSum(5, 6)
    println("-------------------可变长参数----------------------")
    vars(1, 2, 3, 4, 5)
    println()

    //lambda 匿名函数
    var lambdaM: (Int, Int) -> Int = { x, y -> x + y }
    println(lambdaM(3, 3))
    println("-------------------定义常量与变量----------------------")
    varTest()
    println("-------------------字符串模版----------------------")
    stringStu()
    println("-------------------NULL检查机制----------------------")
    nullStu()
    println("-------------------类型检测及自动类型转换----------------------")
    if (sum is Int){
        println("sum is Int 类型")
    }

}


/*************
 * 1.函数定义
 */
fun sum(a: Int, b: Int): Int {  // Int是入参类型， 返回值是Int
    return a + b;
}

//1.1.不指定返回类型，系统自动推断
fun sum2(a: Int, b: Int) = a + b;

/**
 * 1.2.如果该方法要让外部进行调用，需要指定方法的修饰符为public
 * todo 且返回类型Int必须明确指定
 * --在什么场景下使用pulbic 类型呢？？？
 */
public fun sum3(a: Int, b: Int): Int = a + b;

//1.3.无返回值,可以省去Unit
fun printSum(a: Int, b: Int): Unit {
    println(a + b);
}

/*************
 * 2。可变长参数函数
 * todo 使用vararg 关键字标示
 */
fun vars(vararg v: Int) {
    for (i in v) {
        print(i)
    }
}


/*************
 * 3。定义常量与变量
 * todo 可变变量定义： 使用var 关键字
 * - var <标识符> : <类型> = <初始化值>
 * -- 标识符就是变量名称
 * todo 不可变变量定义： 使用 val 关键字（只能赋值一次，类似java的final修饰符）
 * - val <标识符> : <类型> = <初始化值>
 */
fun varTest() {
    val a: Int = 1;
    val b = 1;  //系统自动推断类型为Int
//    b = 2;      // todo 报错，val修复的常量，不可二次赋值
    val c: Int  //声明时没有初始化
    c = 2;

    var x = 5;
    x = 6;
    println(x)
}


/*************
 * 4。字符串模版
 * --  $varName  表示变量值
 * --  ${varName.fun()} 表示变量的方法返回值
 */
fun stringStu() {
    var a = 1;
    val s1 = "a is $a"
    println(s1)

    a = 2;
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)
}

/*************
 * 5。NULL检查机制
 * -- 字段后加!! 像java调用一个null的对象一样
 * -- 字段后加？ 如果为空，后面的操作不执行，返回值为null
 */
fun nullStu() {
    // 类型后面加？ 表示可为空
    var age: String? = null
//    var age: String? = "23"
    // 抛出空指针异常
//    val ages = age!!.toInt()
//    println(ages)
    // 不做处理返回null
    val ages1 = age?.toInt()
    println(ages1)
    // 如果为空直接返回-1，否者调用 toInt()方法返回
    val ages2 = age?.toInt() ?: -1;
    println(ages2)
}