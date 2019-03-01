package com.example.administrator.wqrqwrqwrwqrwq;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {


    List<String> list=new ArrayList<>();
    public FruitAdapter(List<String> list){
            this.list=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.i("test","onCreateViewHolder");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_te,viewGroup,false);
        final ViewHolder viewHolder = new ViewHolder(view);

        viewHolder.fruitName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = viewHolder.getAdapterPosition();
                String a = list.get(position);
                Toast.makeText(v.getContext(),"点击了"+a,Toast.LENGTH_SHORT).show();
            }
        });

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.i("test","onBindViewHolder");
        String a= list.get(i);

        viewHolder.fruitName.setText(a);

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView fruitName;

        public ViewHolder(View view){
            super(view);
            fruitName = view.findViewById(R.id.fruit_name);

        }

    }


}
