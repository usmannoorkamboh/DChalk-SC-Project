package com.example.usmannoor.dchalk11.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usmannoor.dchalk11.DAO.RequestDao;
import com.example.usmannoor.dchalk11.R;

/**
 * The news feed activity
 */
public class Dashboard extends AppCompatActivity {
    RequestDao regdao=new RequestDao();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        /**
         * Instantiatiion of the the activity
         */
        RecyclerView rv=(RecyclerView) findViewById(R.id.rvfeed);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);



        rcadapter adapter = new rcadapter(regdao.get_data());
        rv.setAdapter(adapter);
    }
}
