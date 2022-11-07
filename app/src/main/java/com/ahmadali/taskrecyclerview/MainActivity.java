package com.ahmadali.taskrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    List<MyModel> ls;
    MyAdapter adapter;
    ImageView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);
        add=findViewById(R.id.add);
        ls=new ArrayList<>();
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        ls.add(new MyModel("qwerty","12345678","qwerty"));
        adapter=new MyAdapter(ls,MainActivity.this);
        rv.setAdapter(adapter);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(lm);

        add.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AddActivity.class));
        });
    }
}