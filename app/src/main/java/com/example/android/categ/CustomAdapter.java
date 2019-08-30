package com.example.android.categ;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model> category_list;

    public CustomAdapter(List<Model> category_list, Context context) {
        this.category_list = category_list;
        this.context = context;
    }

    Context context;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = category_list.get(position);
        holder.name.setText(model.getName());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));

    }

    @Override
    public int getItemCount() {
        return category_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.text_view);
        }
    }
}
