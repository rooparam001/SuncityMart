package com.viet.rooparam.suncitymart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePageActivity extends AppCompatActivity {

    Button sign_in, sign_up, google, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        sign_in = findViewById(R.id.sign_in_button);
        sign_up = findViewById(R.id.sign_up_button);
        google = findViewById(R.id.google_log_in_button);
        facebook = findViewById(R.id.facebook_log_in_button);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePageActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePageActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
