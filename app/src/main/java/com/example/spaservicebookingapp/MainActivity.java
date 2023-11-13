package com.example.spaservicebookingapp;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configure the search view
        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle search query submission here
                // Perform search or update the UI accordingly
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle search text change here
                // You can filter/search the list as the user types
                return false;
            }
        });

        // Additional setup for RecyclerView, BottomNavigationView, etc.
    }
}
