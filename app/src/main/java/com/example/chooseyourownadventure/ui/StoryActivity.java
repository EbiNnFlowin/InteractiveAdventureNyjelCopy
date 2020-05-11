package com.example.chooseyourownadventure.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.chooseyourownadventure.R;
import com.example.chooseyourownadventure.model.Page;

public class StoryActivity extends AppCompatActivity {

    private static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if (name == null || name.isEmpty()){
            name = "Player";
        }

        Log.d(TAG, name);
    }
}
