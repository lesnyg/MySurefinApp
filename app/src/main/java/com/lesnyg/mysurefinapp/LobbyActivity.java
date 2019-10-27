package com.lesnyg.mysurefinapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LobbyActivity extends AppCompatActivity {
    private TextView tv_id;
    private TextView tv_pass;
    private TextView tv_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        tv_id = findViewById(R.id.userid);
        tv_pass = findViewById(R.id.userpassword);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");


        tv_id.setText("반갑습니다 " + userID + "님");
        tv_pass.setText("당신의 비밀번호는 " + userPass + " 입니다.");


    }
}
