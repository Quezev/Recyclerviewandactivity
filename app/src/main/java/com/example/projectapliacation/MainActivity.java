package com.example.projectapliacation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterM.OnClickShowListener{

    RecyclerView recrwdata;
    List<Motor> list;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMList();
        recrwdata = findViewById(R.id.rwdata);
        AdapterM adapterM = new AdapterM(this, list,this);
        recrwdata.setAdapter(adapterM);
        recrwdata.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initMList() {
        list = new ArrayList<>();
        list.add(new Motor("MT-25",R.drawable.mt));
        list.add(new Motor("WR155R",R.drawable.wr));
        list.add(new Motor("VIXION",R.drawable.vx));
        list.add(new Motor("R15",R.drawable.r));
        list.add(new Motor("XSR",R.drawable.x));
        list.add(new Motor("NMAX",R.drawable.nx));
        list.add(new Motor("XMAX",R.drawable.xx));
    }

    @Override
    public void onClickShowListener(int position) {
        String name = list.get(position).getNama();
        int gambar = list.get(position).getFoto();

        Intent m = new Intent(this, SActivity.class);
        m.putExtra("nama",name);
        m.putExtra("gam",gambar);
        startActivity(m);
        
    }
}