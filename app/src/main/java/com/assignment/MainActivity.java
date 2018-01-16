package com.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();
    private ListView mListView;

    //creating arrays for name and numbers
    public static String[] name = {"Prabhu", "Sadashiva", "Pramod", "Madana",
            "Usha", "Bhavana", "Siddalinga", "Latha"};
    public static String[] number = {"8923233445", "8392496748", "9692935783", "9153658749",
            "8214355667", "9734524667", "7421647386", "8192837465"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise layout
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        mListView = findViewById(R.id.listView); // init list view

        MyListAdapter adapter = new MyListAdapter(this, name, number);
        mListView.setAdapter(adapter);  // set adapter

        // Set onItemClickListener to listview
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                 /*toast is a short pop-up messages that show for a second or two and then fade away
                int LENGTH_LONG Show the view or text notification for a short period of toast*/
                Log.d(TAG, "onItemClick: ");
                Toast.makeText(MainActivity.this, "Contact with " + name[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
