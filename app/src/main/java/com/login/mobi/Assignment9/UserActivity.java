package com.login.mobi.Assignment9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.login.mobi.Assignment9.Models.User;

public class UserActivity extends AppCompatActivity {
    private TextView tvUser;
    private Button closeBtn;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.tvUser);
        closeBtn = findViewById(R.id.closeBtn);

        if (user != null) {
            tvUser.setText("WELCOME " + user.getName() + " " + user.getLastName());
            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}
