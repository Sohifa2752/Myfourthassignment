package com.example.myfourthassignment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String fruitlist[] = {"apple","banana","apricot","Orange","water melon"};
    int fruitImages[] = {R.drawable.apple,R.drawable.banana,R.drawable.apricot,R.drawable.orange,R.drawable.watermelon};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customlistView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),fruitlist,fruitImages);
        listView.setAdapter(customBaseAdapter);

    }
}