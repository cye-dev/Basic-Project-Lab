package org.techtwon.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button user_login_button = findViewById(R.id.login_by_user);
        Button vet_login_button = findViewById(R.id.login_by_vet);

        String content = user_login_button.getText().toString();
        SpannableString spannableString = new SpannableString(content);
        String word = "사용자";
        int start = content.indexOf(word);
        int end = start + word.length();

        user_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), userLogin.class);
                startActivity(intent);
            }
        });

        vet_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vetLogin.class);
                startActivity(intent);
            }
        });
    }
}