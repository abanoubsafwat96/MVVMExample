package com.safwat.abanoub.mvvmexample;

import android.os.Bundle;

import com.safwat.abanoub.mvvmexample.databinding.ActivityMain2Binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

//MVVM with View Binding
public class Main2Activity extends AppCompatActivity {

    Main2ViewModel main2ViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        main2ViewModel = new ViewModelProvider(this).get(Main2ViewModel.class);

        binding.setMain2ViewModel(main2ViewModel);
        binding.setLifecycleOwner(this);
    }
}