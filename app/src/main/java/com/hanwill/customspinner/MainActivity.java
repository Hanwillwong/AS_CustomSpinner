package com.hanwill.customspinner;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);

        List<String> negaralist = new ArrayList<>();
        negaralist.add("Albania");
        negaralist.add("Belgia");
        negaralist.add("Hungary");
        negaralist.add("Iran");
        negaralist.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaralist);
        spinner1.setAdapter(na);

    }
}