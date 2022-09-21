package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button;
    @Override /*오버라이드 오버로드 차이 알기*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)  findViewById(R.id.button1);
        button2 = (Button)  findViewById(R.id.button2);
        button3 = (Button)  findViewById(R.id.button3);
        button = (Button)  findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"네이버 버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"갤러리 열기를 눌렀어요",
                        Toast.LENGTH_SHORT).show();;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"끝내기를 눌렀어요",
                        Toast.LENGTH_SHORT).show();;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Toast.makeText(getApplicationContext(),"응급전화 버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();;
            }
        });
    }
}