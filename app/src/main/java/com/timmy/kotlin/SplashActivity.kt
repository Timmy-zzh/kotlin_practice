package com.timmy.kotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.view.View
import android.view.Window
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.timmy.kotlin.ui.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * 1。启动页
 * -冒号继承关系 ：
 * -点击跳转
 * -延迟3秒跳转
 * -动画执行
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        var tvTag = findViewById<TextView>(R.id.tv_tag);
//        tvTag.setOnClickListener(View.OnClickListener {
//            jump();
//        })

        //和上面一样
        tv_tag?.setOnClickListener {
            jump();
        }

//        Handler().postDelayed(Runnable() { jump() }, 1500)

        val animation = AlphaAnimation(0.3f, 1.0f)
        animation.run {
            duration = 2000
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                }

                override fun onAnimationEnd(animation: Animation?) {
                    jump()
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })
        }
        cl_splash?.startAnimation(animation)
    }

    fun jump() {
//        var intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)

        Intent(this, MainActivity::class.java).run {
            startActivity(this)
        }
        finish()
    }
}