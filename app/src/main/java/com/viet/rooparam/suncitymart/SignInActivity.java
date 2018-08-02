package com.viet.rooparam.suncitymart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


    }

    public void forgotPassword(View view) {

    }

    public void skip(View view) {
        Intent intent = new Intent(SignInActivity.this,HomePageActivity.class);
        startActivity(intent);
        finish();

    }
}
