package com.example.viewmodelapp;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MutableLiveData<Integer> count = new MutableLiveData<>();


    public LiveData<Integer> getCount() {
        return count;
    }

    public void incrementCount(View view) {
        int currVal = count.getValue() != null ? count.getValue() : 0;
        count.setValue(currVal+1);
    }
}
