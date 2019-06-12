package com.example.ivan.kotelmania;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddNoteActivity extends AppCompatActivity {
    EditText heading;
    EditText content;
    int id = 0;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        heading = findViewById(R.id.add_heading);
        content = findViewById(R.id.add_content);

    }


    public void addANote(View view) {
        String headingText = heading.getText().toString();
        String contentText = content.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("heading", headingText);
        intent.putExtra("content", contentText);
        intent.putExtra("activity", "add");
        intent.putExtra("date", DateFormat.getDateInstance(DateFormat.SHORT).format(Calendar.getInstance().getTime()));
        setResult(RESULT_OK, intent);
        finish();

    }
}
