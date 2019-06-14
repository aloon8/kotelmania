package com.example.ivan.kotelmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText editUserName;
    EditText editPassNum;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) }
                editUserName = findViewById(R.id.UserName);
                String userName = editUserName.getText().toString();
                editPassNum = findViewById(R.id.Password);
                String PassNum = editPassNum.getText().toString();
                if(!userName.equals("Dari") && !PassNum.equals("Dari") ) {
                    Toast.makeText(LoginActivity.this, "User or password incorect.", Toast.LENGTH_LONG).show();
                    return ;
                {}

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }
}
