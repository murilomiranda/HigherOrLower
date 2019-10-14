package com.bankiri.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int randNumber = (int) (Math.random()*20) + 1;

    public void guessNumber(View view) {
        EditText editText = findViewById(R.id.editText);
        String message;
        int givenNumber = Integer.parseInt(editText.getText().toString());

        if (givenNumber == randNumber){
            message = "You got it! Try again!";
            randNumber = (int) (Math.random()*20) + 1;
        } else if (givenNumber > randNumber){
            message = "Lower!";
        } else {
           message = "Higher!";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        //Log.i("Info", "Button pressed");
        //Log.i("Value", "Number is " + givenNumber);
        //Log.i("Random", "Random number is " + randNumber);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
