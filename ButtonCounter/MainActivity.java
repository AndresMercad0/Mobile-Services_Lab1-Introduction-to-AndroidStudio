package com.example.buttoncounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;      // Button widget to be referenced in code
    private TextView textView;  // TextView widget to display the counter value
    private int counter = 0;    // Variable to hold the counter value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Set the content view to the layout defined in activity_main.xml

        button = findViewById(R.id.button);     // Find the button widget by its assigned ID
        textView = findViewById(R.id.textView); // Find the TextView widget by its assigned ID

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment the counter when the button is clicked
                counter++;
                // Update the text of the TextView with the new counter value
                textView.setText("Counter: " + counter);
            }
        });
    }
}
