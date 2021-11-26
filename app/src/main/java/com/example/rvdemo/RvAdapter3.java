package com.example.rvdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter3 extends RecyclerView.Adapter<RvHolder3>{
    private String[] localDataSet;
    private RecyclerViewClickListener listener;

    public RvAdapter3(String[] data, RecyclerViewClickListener listener) {
        this.listener = listener;
        localDataSet = data;
    }

    @NonNull
    @Override
    public RvHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new RvHolder3(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull RvHolder3 holder, int position) {
        int pos = position;
        holder.getTextView().setText(localDataSet[pos]);
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

}
