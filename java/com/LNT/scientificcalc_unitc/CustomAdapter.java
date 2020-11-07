package com.LNT.scientificcalc_unitc;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {



    ArrayList<String> AppName;

    ArrayList<Integer> Image;

    Context context;

    public CustomAdapter(Context context, ArrayList<String> personName, ArrayList<Integer> Image){
        this.context = context;

        this.AppName = personName;

        this.Image = Image;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.Aname.setText(AppName.get(position));

        holder.image.setImageResource(Image.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,AppName.get(position),Toast.LENGTH_LONG).show();

               switch (position){

                   case 0:
                       Intent intent1 = new Intent(context.getApplicationContext(), ScientificCalc.class);
                       context.startActivity(intent1);
                       break;
                   case 1:
                       Intent i2 = new Intent(context.getApplicationContext(),Unit_converter.class);
                       context.startActivity(i2);
                       break;
                   case 2:
                       Intent i3 = new Intent(context.getApplicationContext(), BMI_calc.class);
                       context.startActivity(i3);
                       break;
                   default:
                       Toast.makeText(context,"Pls Choose Right Application",Toast.LENGTH_LONG).show();

               }


            }
        });

    }

    @Override
    public int getItemCount() {
        return AppName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Aname;

        ImageView image;
        public MyViewHolder(View itemView){
            super(itemView);
            this.Aname = (TextView) itemView.findViewById(R.id.name);

            this.image = (ImageView) itemView.findViewById(R.id.image);
        }

    }

}
