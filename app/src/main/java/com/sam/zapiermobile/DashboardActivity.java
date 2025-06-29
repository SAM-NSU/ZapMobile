package com.sam.zapiermobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    private EditText inputPrompt;
    private TextView outputResult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
//        View rootView = findViewById(R.id.root_view);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        inputPrompt = findViewById(R.id.inputPrompt);
        outputResult = findViewById(R.id.outputResult);
        Button run_m1 = findViewById(R.id.run_m1);
        Button run_m2 = findViewById(R.id.run_m2);
        run_m1.setOnClickListener(view -> runM1());
        run_m2.setOnClickListener(view -> runM2());
    }
    private void runM1() {
        String prompt = inputPrompt.getText().toString().trim();
        // TODO: Replace this with local M1 model inference
        String dummyOutput = "M1 says: You entered -> " + prompt;
        outputResult.setText(dummyOutput);
    }

    private void runM2() {
        String prompt = inputPrompt.getText().toString().trim();
        // TODO: Replace this with local M2 model inference
        String dummyOutput = "M2 says: You entered -> " + prompt;
        outputResult.setText(dummyOutput);
    }
}