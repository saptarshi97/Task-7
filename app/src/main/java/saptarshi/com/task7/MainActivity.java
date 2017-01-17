package saptarshi.com.task7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Aditya Walvekar", "Chairperson"));
        data.add(new Data("Divyansh Deora", "Vice Chairperson & Design Head"));
        data.add(new Data("Sukriti Paul","Vice Chairperson"));
        data.add(new Data("Anshuman Awasthi","General Secretary"));
        data.add(new Data("Utshahan Sen","Treasurer"));
        data.add(new Data("Alan Gaurav","Technical Head"));
        data.add(new Data("Vrushank Upadhyay","Technical Head"));
        data.add(new Data("Ileesha Sharma","Publicity and PR Head"));
        data.add(new Data("Kathakali Phouzder","Head of Operations"));
        data.add(new Data("Aayushi Verma","Head of Logistics"));
        data.add(new Data("Manoj Bhat ","Creative and Joint Design Head"));
        data.add(new Data("Soorya Annadurai","Research and Sponsorship Head"));
        data.add(new Data("Arjun Narayan","Development Head"));
        data.add(new Data("Bhargav Karanam","Web Admin"));
        data.add(new Data("Mayank Bansal","Brand Ambassador"));
        return data;
    }
}
