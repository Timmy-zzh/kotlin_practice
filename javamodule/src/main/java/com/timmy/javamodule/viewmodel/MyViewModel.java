package com.timmy.javamodule.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> liveData;

    public MutableLiveData<String> getName() {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
            addName();
        }
        return liveData;
    }

    //添加默认数据
    private void addName() {
        liveData.setValue("111222");
    }
}
