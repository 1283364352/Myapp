package com.example.myapplication1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {
    List<String> list;
    private Context context;

    public Myadapter(List<String> list,Context context) {
        this.list = list;
        this.context=context;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemview=LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);
        Myviewholder myviewholder=new Myviewholder(itemview);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder viewHolder, int i) {
        viewHolder.textView.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder{
        TextView textView;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
