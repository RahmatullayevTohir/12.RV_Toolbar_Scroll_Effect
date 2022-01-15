package com.example.a12rv_toolbar_scroll_effect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a12rv_toolbar_scroll_effect.adapter.CustomAdapter;
import com.example.a12rv_toolbar_scroll_effect.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<User> users = prepareUserList();
        refreshAdapter(users);
    }

    private List<User> prepareUserList() {
        List<User> users =new ArrayList<>();
        for (int i=1; i<30; i++){
            users.add(new User(i+" Abubakr", i+" Akmal"));
        }
        return users;
    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    public void refreshAdapter(List<User> users){
        CustomAdapter adapter = new CustomAdapter(context,users);
        recyclerView.setAdapter(adapter);
    }

}