package com.example.usmannoor.dchalk11.Activities;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usmannoor.dchalk11.DAO.UsersDAO;
import com.example.usmannoor.dchalk11.R;

import static com.example.usmannoor.dchalk11.R.color.offwhite;

/**
 * The first activity visiible to user which prompts for sgnin
 */
public class Login extends AppCompatActivity {
    ImageButton loginbutton;
    ImageButton signupbutton;
    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getColor(offwhite));
        }
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbutton = (ImageButton) findViewById(R.id.login_btn);
        signupbutton = (ImageButton) findViewById(R.id.signup_btn);
        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);

        /**
         * Onclick listener for the login button data goes to dao for authentication
         * and the dao returns user id of the person logging in
         */
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().length() > 1 && password.getText().toString().length() > 1) {



                    UsersDAO usersDAO = new UsersDAO();
                    int id = usersDAO.authenticate(username.getText().toString(), password.getText().toString());
                    //-----

                     if (id > 0) {
                        System.out.println("LOGGING IN with  "+id );
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        Bundle b = new Bundle();
                        b.putInt("userid", id); //Your id
                        intent.putExtras(b);
                        startActivity(intent);
                    }

                } else {

                    Toast.makeText(Login.this, "INVALID USERNAME OR PASSWORD", Toast.LENGTH_LONG).show();

                }
            }
        });

        /**
         *
         * Start a new activity on signup onclick
         */
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, signup_page.class);
                startActivity(intent);
            }
        });


    }


}
