package fr.istef.cw1719.android.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "The onCreate() event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "The onResume() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "The onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "The onDestroy() event");
    }

    public void toastMainActivity(View view) {
        Log.d(LOG_TAG, "Displaying toast");
        Toast.makeText(this, "I am on main activity", Toast.LENGTH_LONG).show();
    }

    public void navigateToImageActivity(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }

    public void navigateToHelloActivity(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        startActivity(intent);
    }

    public void navigateToTodoActivity(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
