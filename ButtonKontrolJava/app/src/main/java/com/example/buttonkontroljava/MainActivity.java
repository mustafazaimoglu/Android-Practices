package com.example.buttonkontroljava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.changeButton);
        name = findViewById(R.id.name);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(name.getText() == "Mustafa")
//                {
//                    name.setText("MKZ");
//                }
//                else
//                {
//                    name.setText("Mustafa");
//                }
//            }
//        });

//        button.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                name.setText("Zaimoglu");
//
//                return false;
//            }
//        });
    }

    public void changeName(View v){
        name.setText("Mustafa Zaimoglu");
    }


}