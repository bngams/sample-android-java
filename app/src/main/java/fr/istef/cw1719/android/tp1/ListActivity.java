package fr.istef.cw1719.android.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import fr.istef.cw1719.android.tp1.adapters.TodoAdapter;

public class ListActivity extends AppCompatActivity {

    ArrayList<String> todos = new ArrayList();
    ArrayAdapter<String> arrayAdapter;
    TodoAdapter todoAdapter;
    ListView lvTodo;
    EditText inputTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // add data in arraylist
        this.todos.add("Push on github");
        this.todos.add("Summary");

        // create adapter
//        this.todoAdapter = new ArrayAdapter<>(this,
//            android.R.layout.simple_list_item_1,
//            todos);

        // set adapter
        this.lvTodo = findViewById(R.id.lv_todo);
        this.lvTodo.setAdapter(todoAdapter);

        this.inputTodo = findViewById(R.id.input_todo);


        this.lvTodo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedTodo = todos.get(position);
                Toast.makeText(getApplicationContext(), "Click on item "+ selectedTodo, Toast.LENGTH_LONG).show();
                Log.d("ITEM LV", "clicked on item");
            }
        });
    }

    public void addTodo(View view) {
        String todo = this.inputTodo.getText().toString();
        this.todoAdapter.add(todo);
        this.inputTodo.setText("");
    }
}
