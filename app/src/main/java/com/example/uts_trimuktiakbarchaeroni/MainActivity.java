package com.example.uts_trimuktiakbarchaeroni;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<Makanan>Makanans = new ArrayList<>();
        rMenu.setAdapter(new Adapter(Makanans, this));
        Makanans.add(new Makanan("Rendang",R.drawable.rendang));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));
        Makanans.add(new Makanan("Ayam Goreng",R.drawable.ayamgoreng));

        rMenu.setLayoutManager(new GridLayoutManager(this,2));

    }
}
