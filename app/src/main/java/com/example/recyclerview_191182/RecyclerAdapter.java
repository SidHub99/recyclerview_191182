package com.example.recyclerview_191182;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ViewHolder>{
    String movie[];
    Context context;
    int images[];
    int buttons[];

    public RecyclerAdapter(String[] movie,int[] images,int[] buttons,Context context) {
        this.movie = movie;
        this.images=images;
        this.buttons=buttons;
        this.context=context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recyclerview_191182,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
    holder.textView.setText(movie[position]);
    holder.imageView.setImageResource(images[position]);
    holder.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context, movie[position], Toast.LENGTH_SHORT).show();

        }
    });
    }

    @Override
    public int getItemCount() {
        return movie.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       TextView textView;
       ImageView imageView;
       Button button;
       CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        textView=itemView.findViewById(R.id.tv_movie);
        imageView=itemView.findViewById(R.id.iv_movie);
        button=itemView.findViewById(R.id.btn_delete);
        cardView=itemView.findViewById(R.id.cv_movie);
        }
    }
}
