package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isModi = true;
    public void change(View view) {
        ImageView ig = findViewById(R.id.imageView);
        if(isModi){
            ig.setImageResource(R.drawable.rahul);
            isModi = false;
        } else{
            ig.setImageResource(R.drawable.modi);
            isModi = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}