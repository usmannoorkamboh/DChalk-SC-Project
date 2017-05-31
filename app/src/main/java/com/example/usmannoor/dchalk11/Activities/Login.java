package com.example.usmannoor.dchalk11.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usmannoor.dchalk11.R;

public class Login extends AppCompatActivity {
    ImageButton loginbutton ;
    ImageButton signupbutton ;
    TextView username ;
    TextView password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbutton = (ImageButton) findViewById(R.id.login_btn);
        signupbutton = (ImageButton) findViewById(R.id.signup_btn);
        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().length() > 1 && password.getText().toString().length() > 1) {


                    //TODO authenticate to dao


                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);

                } else {

                    Toast.makeText(Login.this, "INVALID USERNAME OR PASSWORD", Toast.LENGTH_LONG).show();

                }
            }
        });
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, signup_page.class);
                startActivity(intent);
            }
        });



    }




}
