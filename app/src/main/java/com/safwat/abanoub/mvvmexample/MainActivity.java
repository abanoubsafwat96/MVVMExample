package com.safwat.abanoub.mvvmexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import butterknife.BindView;
import butterknife.ButterKnife;

//MVVM without View Binding
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.openActivity2_btn)
    Button openAcitvity2_btn;

    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        button.setOnClickListener(this);
        openAcitvity2_btn.setOnClickListener(this);

        mainViewModel= new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.movieName.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button){
            mainViewModel.onButtonClicked();

        }else if (v.getId()==R.id.openActivity2_btn){
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }
    }
}
