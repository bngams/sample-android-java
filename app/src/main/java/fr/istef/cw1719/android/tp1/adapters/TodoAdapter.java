package fr.istef.cw1719.android.tp1.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import com.squareup.picasso.Picasso;

import java.util.List;

import fr.istef.cw1719.android.tp1.R;

public class TodoAdapter extends ArrayAdapter<String> {
    public TodoAdapter(@NonNull Context context, int resource, List<String> todos) {
        super(context, resource, todos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        String todo = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lv_item_todo, parent, false);
        }

        CheckBox todoCheck = convertView.findViewById(R.id.checkbox_todo);
        todoCheck.setText(todo);

        return convertView;
    }
}
