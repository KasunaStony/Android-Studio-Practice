package com.example.maruiling.stanfordlectureapp01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int point = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateBotton();

    }

    public void leftBottonClick(View view) {
        // todo
        Button left = (Button) findViewById(R.id.left_botton);
        Button right = (Button) findViewById(R.id.right_botton);
        if(Integer.parseInt(left.getText().toString()) > Integer.parseInt(right.getText().toString())){
            updatePoint(1);
            Toast.makeText(this, "You are right", Toast.LENGTH_SHORT).show();
        }else{
            updatePoint(-1);
            Toast.makeText(this, "You are wrong", Toast.LENGTH_SHORT).show();
        }
        updateBotton();

    }

    public void rightBottonClick(View view) {
        // todo
        Button left = (Button) findViewById(R.id.left_botton);
        Button right = (Button) findViewById(R.id.right_botton);
        if(Integer.parseInt(left.getText().toString()) < Integer.parseInt(right.getText().toString())){
            updatePoint(1);
            Toast.makeText(this, "You are right", Toast.LENGTH_SHORT).show();
        }else{
            updatePoint(-1);
            Toast.makeText(this, "You are wrong", Toast.LENGTH_SHORT).show();
        }
        updateBotton();

    }

    public void updatePoint(int i){
        point += i;
        TextView p = findViewById(R.id.points_field);
        p.setText("Points: " + point);
    }

    public void updateBotton(){
        Random randy = new Random();
        int ran1 = randy.nextInt(10);
        int ran2 = randy.nextInt(10);
        while(ran1 == ran2){
            ran2 = randy.nextInt(10);
        }
        Button left = (Button) findViewById(R.id.left_botton);
        left.setText("" + ran1);
        Button right = (Button) findViewById(R.id.right_botton);
        right.setText("" + ran2);

    }
}
