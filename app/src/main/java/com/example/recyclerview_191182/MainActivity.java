package com.example.recyclerview_191182;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    String []movies={"movie1","movie2","movie3","movie4"};
    int[]images={R.drawable.movies,R.drawable.movies,R.drawable.movies,R.drawable.movies};
    int[] buttons={R.id.btn_delete,R.id.btn_delete,R.id.btn_delete,R.id.btn_delete};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_movie);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter=new RecyclerAdapter(movies,images,buttons,this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}