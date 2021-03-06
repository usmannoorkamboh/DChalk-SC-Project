package com.example.usmannoor.dchalk11.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usmannoor.dchalk11.DAO.UsersDAO;
import com.example.usmannoor.dchalk11.CoreClasses.User;
import com.example.usmannoor.dchalk11.R;
/**
 * Signup PAge for getting user data and registering
 */

public class signup_page extends AppCompatActivity {
    TextView name;
    TextView username;
    TextView password;
    TextView email;
    ImageButton signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        name= (TextView) findViewById(R.id.name);

        username= (TextView) findViewById(R.id.username);
        password= (TextView) findViewById(R.id.password);
        email= (TextView) findViewById(R.id.email);
        signupbutton=(ImageButton)findViewById(R.id.signup_final_btn);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(name.getText().length()>1&&
                        password.getText().length()>1&&
                        email.getText().toString().contains("@")&&
                        username.getText().length()>1)
                {

                    //TODO sign up to dao
                    UsersDAO usersDAO=new UsersDAO();
                   int flag= usersDAO.signup(new User(
                            username.getText().toString(),
                            password.getText().toString(),
                            email.getText().toString(),
                            name.getText().toString()           ));


                }

                else{

                    Toast.makeText(signup_page.this, "Credentials not right", Toast.LENGTH_LONG).show();

                }




            }
        });


    }



}
