package fr.istef.cw1719.android.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HelloActivity extends AppCompatActivity {

    private static final String LOG_TAG = "HelloActivity";
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        // $("#myId");
        this.inputName = findViewById(R.id.input_name);

    }

    public void displayName(View view) {
        Log.d(LOG_TAG, "In display name method");
        Toast.makeText(this, "Hello "+ this.inputName.getText(), Toast.LENGTH_LONG).show();
    }
}
