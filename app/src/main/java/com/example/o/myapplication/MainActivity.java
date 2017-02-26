package com.example.o.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
     private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
   protected void Change(View view){
       text=(TextView)findViewById(R.id.Text);
       text.setText("欢迎来到Android测试!");
   }
    protected  void change(View viex) {
       text=(TextView)findViewById(R.id.Text);
        text.setTextColor(android.graphics.Color.RED);
    }
}
