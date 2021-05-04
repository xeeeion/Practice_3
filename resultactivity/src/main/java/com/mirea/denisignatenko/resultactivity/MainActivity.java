package com.mirea.denisignatenko.resultactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewUniversity;
    private final int REQUEST_CODE = 143;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUniversity = findViewById(R.id.university);
    }

    public void onClickGetUniversity(View v) {
        Intent intent = new Intent(this, DateActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            String university = data.getStringExtra("university");
            setUniversityTextView(university);
        }
    }

    private void setUniversityTextView(String text) {
        textViewUniversity.setText(text);
    }
}
