package com.example.usmannoor.dchalk11.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usmannoor.dchalk11.CoreClasses.RequestDao;
import com.example.usmannoor.dchalk11.R;

public class Dashboard extends AppCompatActivity {
    RequestDao regdao=new RequestDao();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        RecyclerView rv=(RecyclerView) findViewById(R.id.rvfeed);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);



        rcadapter adapter = new rcadapter(regdao.get_data());
        rv.setAdapter(adapter);
    }
}
