package com.example.myfirstapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.myfirstapp.R;

public class budget_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_calculator);
    }
    public void buttonOnCalculatorConfirm (View view){
        Intent intent = new Intent (this, expenditure_main.class);
        startActivity(intent);
    }
}
