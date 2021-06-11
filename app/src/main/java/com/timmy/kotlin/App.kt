package com.timmy.kotlin

import android.app.Application
import android.content.Context

/**
 * wanAndroid项目开发：使用kotlin语言 + JetPacket架构
 *
 * 使用kotlin实现一个完整的android项目
 * -页面跳转，与传值
 * -与java互相调用
 * -范型
 * -协程
 */
class App : Application() {

    /**
     * dan li
     */
    companion object {
        lateinit var app: App
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        app = this;
    }
}