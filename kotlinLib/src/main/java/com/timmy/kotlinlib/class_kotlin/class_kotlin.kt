package com.timmy.kotlinlib.class_kotlin

/**
 * 1.
 */
fun main(args: Array<String>) {
    println("-------Kotlin 类相关学习---------")
    var user = User("11", 1)

    var user1 = User1()
    var user11 = User1(password = 111)
    println(user11.toString())

    println("--次构造函数--")
    User2()
    var use21 = User2("xyz")
    User2(22)
    User2(23, 1)

    println("--类的属性--")
    var p1 = Person()
    p1.name = "aaa"
//    p1.sex = 'ss '  //vla定义的是常量，只可以读取，不能值修改
    println(p1.name + " - " + p1.sex)
    val p2 = Person();
    p2.name = "bbb"

    println("--类的继承，方法复写--")
    var cat = Cat();
    cat.eat()

    println("--数据类--")
    var use4 = User4("joay",19)
    println(use4.toString())

    println("--枚举--")
    Color.BLUE
}