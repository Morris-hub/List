package com.example.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


    public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder>{

        //          ++ MyViewHolder Class ++

        //create Arraylist of Type User
        private ArrayList<User> usersList;

        //Initalize the Data from User class
        public  recyclerAdapter(ArrayList<User> usersList){
            this.usersList = usersList;
        }
        //View insider ViewHolder
        public class  MyViewHolder extends RecyclerView.ViewHolder{
            private TextView nameTxt;

            public MyViewHolder(final View view){//Constructor
                super(view);
                nameTxt = view.findViewById(R.id.textView2);
            }
        }



         //                         ++ Adapter ++


        //Create new Views
        @NonNull
        @Override
        public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
            return new MyViewHolder(itemView);
        }

        //Binds Data (stored in User Class) with UI(ViewHolder)
        @Override
        public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {

            //usernames from User Class
            String name = usersList.get(position).getUsername();
            holder.nameTxt.setText(name);


        }

        @Override
        public int getItemCount() {
            return usersList.size(); //No Limt for List items
        }

        public interface OnItemClickListner{
            void OnItemClickListner(int position);

        }
    }
