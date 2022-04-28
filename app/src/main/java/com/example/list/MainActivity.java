package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<User> usersList;
    private RecyclerView recyclerView;
    private EditText addItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItem = (EditText) findViewById(R.id.addItem);

        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();
        setUserInfo();
        setAdapter();


    }

    public void addToList(View view){
        String name = addItem.getText().toString();
        usersList.add(new User(name));
        
    }

    private void setAdapter(){
        recyclerAdapter adapter = new recyclerAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setUserInfo(){
        usersList.add(new User("John"));
        usersList.add(new User("Mike"));
        usersList.add(new User("Alice"));
        usersList.add(new User("Mark"));
        usersList.add(new User("Johnny"));
        usersList.add(new User("Martin"));
        usersList.add(new User("Ralph" ));
        usersList.add(new User("Lisa"));
        usersList.add(new User("Mikasa"));
        usersList.add(new User("Eren"));
        usersList.add(new User("Louise"));
        usersList.add(new User("Tatake"));
        usersList.add(new User("besto furendo"));
        usersList.add(new User("Zoro"));
        usersList.add(new User("Bob's Sohn"));

    }

}