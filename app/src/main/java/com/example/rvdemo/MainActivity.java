package com.example.rvdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private RvAdapter3.RecyclerViewClickListener listener;
    RvAdapter3 rvAdapter3;
    RvAdapter2 rvAdapter2;
    RvAdapter1 rvAdapter1;
    LinearLayoutManager mLayoutManager;
    String[] mDataset;
    private static final int DATASET_COUNT = 60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);
        //this code for adapter with listener method
        listener = new RvAdapter3.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("data", mDataset[position]);
                startActivity(intent);
            }
        };

        initDataset();
        rvAdapter1 = new RvAdapter1(mDataset);//common adapter
        rvAdapter2 = new RvAdapter2(mDataset, this);//adapter with context
        rvAdapter3 = new RvAdapter3(mDataset, listener);//adapter with listener

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //you can choose your desired adapter just change last character the result is same
        mRecyclerView.setAdapter(rvAdapter3);

    }

    private void initDataset() {
        int counter;
        mDataset = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            counter = i+1;
            mDataset[i] = "This is element #" + counter;
        }
    }
}