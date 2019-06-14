package com.example.ivan.kotelmania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FundraisingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundraising);
        Button buttonname = (Button) findViewById(R.id.button) ;
        EditText editText = (EditText) findViewById(R.id.add_heading) ;
        TextView  textView = (TextView) findViewById(R.id.textView) ;

//        buttonname.setOnClickListener();
    }
}
