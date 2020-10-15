package com.example.diwali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.diwali.R.id.default_seekbar;
//import static com.example.diwali.R.id.mode0layout;

public class MainActivity extends AppCompatActivity {
    int current_progress = 50;
    int current_mode = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final Button mode0_button = findViewById(R.id.mode0);
        final Button mode1_button = findViewById(R.id.mode1);
        final Button mode2_button = findViewById(R.id.mode2);
        final Button mode3_button = findViewById(R.id.mode3);
        final Button mode4_button = findViewById(R.id.mode4);
        final Button mode5_button = findViewById(R.id.mode5);
        final DatabaseReference myRef = database.getReference("modes");
        final TextView speedmeter = findViewById(R.id.speedmeter);
        final SeekBar mode_seek = findViewById(default_seekbar);
        mode_seek.setProgress(current_progress);



        mode0_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 0;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));

            }
        });
        mode1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 1;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));
            }
        });
        mode2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 2;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));
            }
        });
        mode3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 3;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));
            }
        });
        mode4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 4;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));
            }
        });
        mode5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_progress = 50;
                mode_seek.setProgress(current_progress);
                current_mode = 5;
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));

            }
        });
        mode_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                current_progress = mode_seek.getProgress();
                myRef.setValue(String.valueOf(current_mode)+" "+String.valueOf(current_progress));
                speedmeter.setText("Current Speed is "+ String.valueOf(current_progress) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}