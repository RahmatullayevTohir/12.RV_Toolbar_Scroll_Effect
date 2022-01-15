package com.example.a12rv_toolbar_scroll_effect.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a12rv_toolbar_scroll_effect.R;
import com.example.a12rv_toolbar_scroll_effect.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public Context context;
    private List<User> users;

    public CustomAdapter(Context context, List<User> users){
        this.context = context;
        this.users = users;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_view,parent,false);
        return  new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);
        if (holder instanceof CustomViewHolder){
            TextView Abubakr = ((CustomViewHolder)holder).abubakr;
            TextView Akmal = ((CustomViewHolder)holder).akmal;

            Abubakr.setText(user.getAbubakr());
            Akmal.setText(user.getAkmal());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView abubakr, akmal;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            abubakr = view.findViewById(R.id.abubakr);
            akmal = view.findViewById(R.id.akmal);
        }
    }
}
