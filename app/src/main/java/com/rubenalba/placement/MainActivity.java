package com.rubenalba.placement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        initListeners();
    }

    private void initComponents() {
        tvForgotPassword = findViewById(R.id.tv_main_forgotpassword);
    }

    private void initListeners() {
        tvForgotPassword.setOnClickListener(View -> {
            Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);

            startActivity(intent);
        });
    }
}