package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetingTV;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingTV = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new GreetingClickListener());

    }
    public class GreetingClickListener implements View.OnClickListener  {
        @Override
        public void onClick(View v) {
            changeGreeting();
        }
     }

    private void changeGreeting(){
        if(greetingTV.getText().equals(getString(R.string.hello)))
        {
            greetingTV.setText(getString(R.string.goodbye));
        }
        else
        {
            greetingTV.setText(getString(R.string.hello));
        }
    }

}
