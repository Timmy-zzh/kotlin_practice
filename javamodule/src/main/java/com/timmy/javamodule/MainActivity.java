package com.timmy.javamodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;

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
