package com.example.activity2025jan

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("MainActivityApp", "onCreate-1")
        Log.d("MainActivityApp", "1. Initialize views (using findViewById or ViewBinding).\n" +
                "2. Set up necessary data, e.g., retrieve data from a database or API, or prepare ViewModel.\n" +
                "3. Set up listeners (e.g., button click listeners, RecyclerView adapters).\n" +
                "4. Restore any saved state using savedInstanceState if needed.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivityApp", "onStart-2")
        Log.d("MainActivityApp", "1. Set up UI components that depend on the visibility of the activity.\n" +
                "2. Start animations, or load data needed for visible components.\n" +
                "3. Make sure that data that the user will see is ready by this point.")
    }


    override fun onResume() {
        super.onResume()
        Log.d("MainActivityApp", "onResume-3")
        Log.d("MainActivityApp", "1. Start any resources that need to be active for user interaction (e.g., starting sensors, listening for changes).\n" +
                "2. Register any broadcast receivers or listeners (e.g., location updates, sensor events).\n" +
                "3. Resume any paused processes (e.g., a paused video or sound).")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivityApp", "onPause-4")
        Log.d("MainActivityApp", "1. Pause any ongoing tasks (e.g., video playback, sound, or animations).\n" +
                "2. Unregister listeners or receivers that consume resources unnecessarily.\n" +
                "3. Save temporary state, such as user input in a form, if necessary.\n" +
                "4. Ensure that UI updates do not happen if the activity is no longer visible.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivityApp", "onStop-5")
        Log.d("MainActivityApp", "1. Release any resources that are no longer needed (e.g., stop location updates, cancel network calls).\n" +
                "2. Store data that needs to persist between session changes. This could be done in onSaveInstanceState or a more persistent store (e.g., SharedPreferences or Database).\n" +
                "3. Handle situations where background tasks or services need to be paused or cleaned up.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivityApp", "onRestart-6")
        Log.d("MainActivityApp", "1. Free up resources that might still be held, such as bitmaps, sensors, or active threads.\n" +
                "2. Make sure all listeners and callbacks are unregistered to prevent memory leaks.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy-7")
    }

}