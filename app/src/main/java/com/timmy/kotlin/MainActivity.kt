package com.timmy.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * 使用kotlin实现一个完整的android项目
 * -页面跳转，与传值
 * -与java互相调用
 * -范型
 * -协程
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}