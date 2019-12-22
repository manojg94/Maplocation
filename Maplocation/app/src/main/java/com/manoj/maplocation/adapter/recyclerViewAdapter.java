package com.manoj.maplocation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manoj.maplocation.R;

import java.util.List;


public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.viewHolder>{
    //model and interface
    public List<recyclerModel> recyclerModel;
    //step 1
    public recyclerViewAdapter(List<recyclerModel> recyclerModel) {
        this.recyclerModel=recyclerModel;
    }
    ////step 2
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title,temp,min,max,humidity;
        Context context;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //initializtions of the UI like textview etc

            context=itemView.getContext();
            title = itemView.findViewById(R.id.moviename);
            temp = itemView.findViewById(R.id.temp);
            min = itemView.findViewById(R.id.min);
            max = itemView.findViewById(R.id.max);
            humidity = itemView.findViewById(R.id.humidity);
        }

        @Override
        public void onClick(View view) {

        }
    }

    //below are the implementations of recycler view
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //create views here like layout initializtions only and retrurn the layout view
        //retrun viewholder with params as view and interface
        // .inflate 3rd parameter should be false
        final View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.data_list,viewGroup,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        //here  binding the data to the UI like textview etc.

        viewHolder.title.setText(recyclerModel.get(i).getTitle());
        viewHolder.temp.setText(recyclerModel.get(i).getTemp());
        viewHolder.min.setText(recyclerModel.get(i).getMintemp());
        viewHolder.max.setText(recyclerModel.get(i).getMaxtemp());
        viewHolder.humidity.setText(recyclerModel.get(i).getHumidity());
    }

    @Override
    public int getItemCount() {
        return recyclerModel.size();
    }




}
