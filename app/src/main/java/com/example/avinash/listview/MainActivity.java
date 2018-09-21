package com.example.avinash.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    private String a[] = {"31","28","31","3","31","30","31","31","30","31","30","31"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.dynamic);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,a);
        lv.setAdapter(ad);
    }
}
