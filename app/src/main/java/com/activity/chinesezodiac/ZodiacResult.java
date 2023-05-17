package com.activity.chinesezodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ZodiacResult extends AppCompatActivity {

    TextView zodiacString;
    ImageView zodiacImage;
    Button backBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_result);

        zodiacString = findViewById(R.id.zodiacName);
        zodiacImage = findViewById(R.id.zodiacImage);
        backBTN = findViewById(R.id.backBtn);

        int zodiac =  getIntent().getIntExtra("chineseZodiac", 0);
        String[] zodiacSigns = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        String zodiacSign = zodiacSigns[zodiac];
        zodiacString.setText(zodiacSign);


        switch (zodiac){
            case 0:
                zodiacImage.setImageResource(R.drawable.monkey);
                break;
            case 1:
                zodiacImage.setImageResource(R.drawable.rooster);
                break;
            case 2:
                zodiacImage.setImageResource(R.drawable.dog);
                break;
            case 3:
                zodiacImage.setImageResource(R.drawable.pig);
                break;
            case 4:
                zodiacImage.setImageResource(R.drawable.rat);
                break;
            case 5:
                zodiacImage.setImageResource(R.drawable.ox);
                break;
            case 6:
                zodiacImage.setImageResource(R.drawable.tiger);
                break;
            case 7:
                zodiacImage.setImageResource(R.drawable.rabbit);
                break;
            case 8:
                zodiacImage.setImageResource(R.drawable.dragon);
                break;
            case 9:
                zodiacImage.setImageResource(R.drawable.snake);
                break;
            case 10:
                zodiacImage.setImageResource(R.drawable.horse);
                break;
            case 11:
                zodiacImage.setImageResource(R.drawable.sheep);
                break;
        }

        Toast.makeText(ZodiacResult.this, "Your Chinese zodiac sign is " + zodiacSign, Toast.LENGTH_SHORT).show();
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ZodiacResult.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}