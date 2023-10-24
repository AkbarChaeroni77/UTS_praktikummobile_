package com.example.uts_trimuktiakbarchaeroni;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Makanan> Makanans;
    private Context context;

    public Adapter(ArrayList<Makanan> Makanans, Context context){
        this.Makanans = Makanans;
        this.context = context;
    }
    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        Makanan makanan = Makanans.get(position);
        holder.judul.setText(makanan.getJudul());
        holder.img.setImageResource(makanan.getImg());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,DetailMakanan.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Makanan", Makanans);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Makanans.size();
    }
    public class Holder extends RecyclerView.ViewHolder {
        public TextView judul;
        public ImageView img;
        public Button btnDetail;
        public Holder(@NonNull View itemview){
            super(itemview);
            judul = itemview.findViewById(R.id.judul);
            img = itemview.findViewById(R.id.imgMakanan);
            btnDetail = itemview.findViewById(R.id.detail);
        }
    }
}
