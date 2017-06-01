package com.example.usmannoor.dchalk11.Activities;

/**
 * Created by Noman on 5/31/2017.
 */

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import android.support.v7.widget.CardView;

import com.example.usmannoor.dchalk11.CoreClasses.Problem;
import com.example.usmannoor.dchalk11.Navigate;
import com.example.usmannoor.dchalk11.R;

/**
 * Created by Noman on 5/31/2017.
 */

public class rcadapter extends RecyclerView.Adapter<rcadapter.PersonViewHolder> {
    List<Problem> Problems;

    rcadapter(List<Problem> persons) {
        this.Problems = persons;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView lat;
        TextView lon;
        ImageView photo;
        Button navbutton;
        Button resolve;
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.Name);
            lat = (TextView) itemView.findViewById(R.id.lat);
            lon = (TextView) itemView.findViewById(R.id.lon);
            photo = (ImageView) itemView.findViewById(R.id.photo);
            navbutton=(Button)itemView.findViewById(R.id.Navigatebutton);
            resolve=(Button)itemView.findViewById(R.id.Navigatebutton);
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
        personViewHolder.lon.setText(Problems.get(i).getLon().toString());
        personViewHolder.lat.setText(Problems.get(i).getLat().toString());
        personViewHolder.personName.setText("Anonymous");
        personViewHolder.photo.setImageResource(R.drawable.bg2);
        personViewHolder.navbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO SAI SAI MAP KHOLNA
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                view.getContext().startActivity(mapIntent);
            }
        });
        personViewHolder.resolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //TODO delete the problem
            }
        });




    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
