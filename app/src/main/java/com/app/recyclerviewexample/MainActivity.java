package com.app.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContacts.add(new ContactModel(R.drawable.abir,"Md. Abir","+8801941199600"));
        arrContacts.add(new ContactModel(R.drawable.apple,"Md. Apple","+8801941199254"));
        arrContacts.add(new ContactModel(R.drawable.asif,"Asif Joardar  ","+880142358600"));
        arrContacts.add(new ContactModel(R.drawable.emon,"Mohammad Emon","+880191449600"));
        arrContacts.add(new ContactModel(R.drawable.khorshed,"Khorsed Alam","+88014411128400"));
        arrContacts.add(new ContactModel(R.drawable.sadia,"Sadia Islam","+8801401199600"));

    }
}