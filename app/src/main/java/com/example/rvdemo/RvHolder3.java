package com.example.rvdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvHolder3 extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView textView;
    RvAdapter3.RecyclerViewClickListener listener;
    public RvHolder3(@NonNull View itemView, RvAdapter3.RecyclerViewClickListener listener) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        itemView.setOnClickListener(this);
        this.listener = listener;
    }

    public TextView getTextView() {
        return textView;
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition());
    }
}
