package com.example.rvdemo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvHolder1 extends RecyclerView.ViewHolder{
    TextView textView;
    LinearLayout linearLayout;

    public RvHolder1(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        linearLayout = itemView.findViewById(R.id.linLayout);
        // Define click listener for the ViewHolder's View.
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("data", textView.getText());
                v.getContext().startActivity(intent);
                //Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
            }
        });
    }

    public TextView getTextView() {
        return textView;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }
}
