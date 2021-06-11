package com.timmy.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleObserver
import com.timmy.kotlin.App
import com.timmy.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 4个底部Tab
 * - Home，Hoke，框架，我的
 * 网络，H5页面
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applicationInfo = App.app.applicationInfo
        Log.e("Tim", applicationInfo.processName)

        var tv = findViewById<TextView>(R.id.tv_main)
        tv.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Toast stet", Toast.LENGTH_SHORT).show()
        })

        tv_main?.run {
            this.setOnClickListener(View.OnClickListener {

            })
        }

        lifecycle.addObserver(MyObserver())

    }

    public class MyObserver : LifecycleObserver {

    }

}