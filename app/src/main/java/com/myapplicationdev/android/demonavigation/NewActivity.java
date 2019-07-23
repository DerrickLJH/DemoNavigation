package com.myapplicationdev.android.demonavigation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NewActivity extends AppCompatActivity {
    ActionBar ab;
    Boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        final FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isChecked) {
                    fab.setImageResource(R.drawable.ic_check_black_24dp);
                    isChecked = true;
                } else {
                    fab.setImageResource(R.drawable.ic_input_add);
                    isChecked = false;
                }
            }
        });

    }
}
