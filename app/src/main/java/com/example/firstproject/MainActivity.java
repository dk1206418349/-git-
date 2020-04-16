package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = f(R.id.textView);
        textView.setText("Hello World!");
        button=f(R.id.button);
        button.setOnClickListener(v -> {
            Toast.makeText(this, "666", Toast.LENGTH_SHORT).show();
        });
    }

    public <T extends View> T f(int id) {
        return (T) findViewById(id);
    }
}
