package com.example.maruiling.firsttryfailed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void changeToAdd(View view){
        Intent intent = new Intent(this, Add.class);
        startActivity(intent);
    }


}
