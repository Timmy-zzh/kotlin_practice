package com.timmy.javamodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;

import android.os.Bundle;
import android.view.View;

public class LiveDataStuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
    }

    public void test(View view) {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TLog.d(s);
            }
        });

        // 转换
        LiveData<String> mapLiveData = Transformations.map(mutableLiveData, new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input + " Map applay ";
            }
        });
        mapLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TLog.d(" 222 :"+s);
            }
        });

        mutableLiveData.postValue("JetPacket Study - livedata");
    }
}