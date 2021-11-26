package com.example.rvdemo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvHolder2 extends RecyclerView.ViewHolder{
    TextView textView;
    LinearLayout linearLayout;

    public RvHolder2(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        linearLayout = itemView.findViewById(R.id.linLayout);

    }

    public TextView getTextView() {
        return textView;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

}
