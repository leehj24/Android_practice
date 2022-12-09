package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button buttonEvent = (Button) findViewById(R.id.bt1);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent2 = (Button) findViewById(R.id.bt2);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent2.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent2.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent2.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent3 = (Button) findViewById(R.id.bt3);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent3.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent3.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent3.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent4 = (Button) findViewById(R.id.bt4);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent4.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent4.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent4.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent5 = (Button) findViewById(R.id.bt5);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent5.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent5.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent5.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent6 = (Button) findViewById(R.id.bt6);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent6.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent6.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent6.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent7 = (Button) findViewById(R.id.bt7);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent7.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent7.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent7.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent8 = (Button) findViewById(R.id.bt8);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent8.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent8.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent8.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent9 = (Button) findViewById(R.id.bt9);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent9.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent9.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent9.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent10 = (Button) findViewById(R.id.bt10);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent10.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent10.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent10.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });

            Button buttonEvent13 = (Button) findViewById(R.id.bt10);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent13.setBackgroundColor(Color.parseColor("#4A3705"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent13.setBackgroundColor(Color.parseColor("#BEB38C"));
                        buttonEvent13.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent11 = (Button) findViewById(R.id.bt11);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent11.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent11.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent11.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
            Button buttonEvent12 = (Button) findViewById(R.id.bt12);
            buttonEvent.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        buttonEvent12.setBackgroundColor(Color.parseColor("#BEB38C"));
                    } else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                        buttonEvent12.setBackgroundColor(Color.parseColor("#4A3705"));
                        buttonEvent12.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                    return false;
                }
            });
    }
}