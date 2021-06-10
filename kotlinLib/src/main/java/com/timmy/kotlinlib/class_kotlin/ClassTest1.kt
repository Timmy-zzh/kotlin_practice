package com.timmy.kotlinlib.class_kotlin

//定义一个User类
class User(name: String, password: Int) {
}

//指定默认参数
class User1(name: String = "Tim", password: Int = 123) {

}

class User2 constructor(name: String) {
    //主构造函数
    init {
        println(name)
    }

    constructor() : this("aaa")

    //次构造函数
    constructor(age: Int) : this("sss") {
        println(age)
    }

    //次构造函数
    constructor(age: Int, sex: Int) : this("aaa") {
        println("$sex -- $age")
    }
}

class Person {
    var name: String = ""
    val sex: String = "男"
}

/**
 * 要让父类可以被继承&方法重写，需要在定义class前面添加open关键字
 */
open class Anima {
    open fun eat() {
        println(" Animal eat ")
    }
}

class Cat : Anima() {

    override fun eat() {
        println(" Cat eat ")
    }
}

//接口
interface UserImpl {
    fun getName(): String   //无默认实现，必须重写
    fun getAge(): Int {
        return 18;
    }
}

interface B {}

class User3 : UserImpl {
    override fun getName(): String {
        return "11"
    }

}

/**
 * 数据类data
 * 默认会创建的方法：
 * get/set
 * equals
 * toString
 * copy
 */
data class User4(val name: String, val age: Int)

/**
 * 枚举
 */
enum class Color {
    RED,
    GREEN,
    BLUE
}