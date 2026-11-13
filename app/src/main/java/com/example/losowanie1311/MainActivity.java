package com.example.losowanie1311;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected Button buttonLosuj, buttonOdp1, buttonOdp2, buttonOdp3, buttonOdp4;
    protected TextView textView;

    ArrayList<String> listaSlowPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonLosuj = findViewById(R.id.buttonLosuj);
        buttonOdp1 = findViewById(R.id.buttonOdp1);
        buttonOdp2 = findViewById(R.id.buttonOdp2);
        buttonOdp3 = findViewById(R.id.buttonOdp3);
        buttonOdp4 = findViewById(R.id.buttonOdp4);
        textView = findViewById(R.id.textView);
        listaSlowPP = new ArrayList<>();
        listaSlowPP.add("")
    }
}