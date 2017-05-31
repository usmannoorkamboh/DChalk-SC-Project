package com.example.usmannoor.dchalk11.Activities;

/**
 * Created by Noman on 5/31/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usmannoor.dchalk11.CoreClasses.Problem;
import com.example.usmannoor.dchalk11.R;

import java.util.List;

/**
 * Created by Noman on 5/31/2017.
 */

public class rcadapter extends RecyclerView.Adapter<rcadapter.PersonViewHolder> {
    List<Problem> Problems;

    rcadapter(List<Problem> persons){
        this.Problems = persons;
    }
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }
    @Override
    public int getItemCount() {
        return Problems.size();
    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }
    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(Problems.get(i).getLat().toString());
        personViewHolder.personAge.setText(Problems.get(i).getLat().toString());
        personViewHolder.personPhoto.setImageResource(R.drawable.bg2);
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
