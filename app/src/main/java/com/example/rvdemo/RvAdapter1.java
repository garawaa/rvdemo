package com.example.rvdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter1 extends RecyclerView.Adapter<RvHolder1>{
    private String[] localDataSet;

    public RvAdapter1(String[] localDataSet) {
        this.localDataSet = localDataSet;
    }

    @NonNull
    @Override
    public RvHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new RvHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvHolder1 holder, int position) {
        int pos = position;
        holder.getTextView().setText(localDataSet[pos]);
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
