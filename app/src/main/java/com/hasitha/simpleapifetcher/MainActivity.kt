package com.hasitha.simpleapifetcher

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity is the entry point of the application.
 * This class extends AppCompatActivity and overrides its onCreate method
 * to fetch data from an API and display it on the screen.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Called when the activity is first created.
     * Initializes the UI and triggers an API call via FetchDataTask.
     *
     * @param savedInstanceState A Bundle object containing the activity's previous state, if it exists.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the TextView from the layout
        val textView: TextView = findViewById(R.id.textView)

        // Execute the FetchDataTask AsyncTask to fetch data from the API and display it in the TextView
        FetchDataTask { result ->
            textView.text = result
        }.execute("https://jsonplaceholder.typicode.com/todos/1")
    }
}