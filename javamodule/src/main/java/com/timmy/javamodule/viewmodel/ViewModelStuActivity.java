package com.timmy.javamodule.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.timmy.javamodule.R;
import com.timmy.javamodule.TLog;

public class ViewModelStuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

        //ViewModel 的使用
        MyViewModel myViewModel = new ViewModelProvider(
                this, ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()))
                .get(MyViewModel.class);

        myViewModel.getName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TLog.d(s);
            }
        });

    }
}