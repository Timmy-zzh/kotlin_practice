package com.timmy.javamodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.timmy.javamodule.viewmodel.ViewModelStuActivity;

/**
 * JetPacket java语言实现
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLifecycle().addObserver(new MyObserver());
    }

    @Override
    protected void onResume() {
        super.onResume();
        TLog.d("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TLog.d("onPause");
    }

    public void jump(View view) {
        startActivity(new Intent(this, LiveDataStuActivity.class));
    }

    public void jumpMVVM(View view) {
        startActivity(new Intent(this, ViewModelStuActivity.class));
    }

    private class MyObserver implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        void onResume() {
            TLog.d("MyObserver -- onPause");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        void onPause() {
            TLog.d("MyObserver -- onPause");
        }
    }
}
