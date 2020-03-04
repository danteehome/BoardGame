package com.example.boardgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HangOverPage extends AppCompatActivity {
    //attributes: Image logo, Image background, Button login, Button register, Button setting,


    private static final String TAG = "setting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsetting = findViewById(R.id.setting);
        Button btnlogin = findViewById(R.id.LoginButton);
        Button btnregister= findViewById(R.id.RegisterButton);
        ListView settings = findViewById(R.id.setting_list);




        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showsetting();


            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
                Toast.makeText(HangOverPage.this, "login function called.", Toast.LENGTH_LONG).show();
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
                Toast.makeText(HangOverPage.this, "register function called.", Toast.LENGTH_LONG).show();
            }
        });

    }


    private void showsetting(){
        Intent intent=new Intent(this, Settings.class);
        startActivity(intent);

    }
    private void login(){

    }
    private void register(){

    }
}
