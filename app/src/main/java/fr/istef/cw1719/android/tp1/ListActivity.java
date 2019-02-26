package fr.istef.cw1719.android.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<String> todos = new ArrayList();
    ArrayAdapter<String> todoAdapter;
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
        this.todoAdapter = new ArrayAdapter<>(this,
            android.R.layout.simple_list_item_1,
            todos);

        // set adapter
        this.lvTodo = findViewById(R.id.lv_todo);
        this.lvTodo.setAdapter(todoAdapter);

        this.inputTodo = findViewById(R.id.input_todo);
    }

    public void addTodo(View view) {
        String todo = this.inputTodo.getText().toString();
        this.todoAdapter.add(todo);
        this.inputTodo.setText("");
    }
}
