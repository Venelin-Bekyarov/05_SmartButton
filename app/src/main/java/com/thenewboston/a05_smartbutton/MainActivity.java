package com.thenewboston.a05_smartbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vensButton = (Button) findViewById(R.id.vensButton);

        vensButton.setOnClickListener(
                v -> {
                    TextView vensText = (TextView) findViewById(R.id.vensText);
                    vensText.setText("Good job!");
                }
        );

        vensButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView vensText = (TextView) findViewById(R.id.vensText);
                        vensText.setText("Okay!");
                        return true;
                    }
                }
        );

    }
}