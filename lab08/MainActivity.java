package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int  player = 1 ; //for player1 which is cross;
    int [][]winningState = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int []gameState = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public void load(View view){
        ImageView v = (ImageView) view;
        int tag = Integer.parseInt(v.getTag().toString());
        if(player == 1){
            v.setImageResource(R.drawable.cross);
            gameState[tag] = player;
            Toast.makeText(this,tag+" "+"Cross",Toast.LENGTH_SHORT).show();
            player = 2;
        }
        else{
            v.setImageResource(R.drawable.zero);
            gameState[tag] = player;
            Toast.makeText(this,tag+" "+"Zero",Toast.LENGTH_SHORT).show();
            player = 1;
        }
        //winning condition check
        for(int i = 0 ; i < winningState.length ; ++i){
            if(gameState[winningState[i][0]] == gameState[winningState[i][1]){
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}