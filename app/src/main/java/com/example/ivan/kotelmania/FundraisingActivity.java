package com.example.ivan.kotelmania;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FundraisingActivity extends AppCompatActivity {
    static int Th = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundraising);
        Button buttonname = (Button) findViewById(R.id.button) ;
        final EditText editText = (EditText) findViewById(R.id.add_heading) ;
        final TextView textView = (TextView) findViewById(R.id.textView) ;
        Th = readFromInternalStorage();
        textView.setText("Fundraising: " + Th);
        buttonname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = Integer.parseInt(editText.getText().toString());
                Th = readFromInternalStorage();
                Th += temp;
                textView.setText("Fundraising: " + Th);
                saveToInternalStorage(Th);

            }
        });
    }
    public void saveToInternalStorage(int Fun) {
        try {
            FileOutputStream output = openFileOutput("text.txt",MODE_PRIVATE);
            output.write(Fun);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int readFromInternalStorage(){
        try{
            FileInputStream input = openFileInput("text.txt");
            int r;
            r=input.read();
            input.close();
            return r;
        }catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
