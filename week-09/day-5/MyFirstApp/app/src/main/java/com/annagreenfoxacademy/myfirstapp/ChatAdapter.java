package com.annagreenfoxacademy.myfirstapp;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import java.util.ArrayList;

/**
 * Created by Anna on 16/12/23.
 */

public class ChatAdapter extends ArrayAdapter<Message> {
    public ChatAdapter(Context context, ArrayList<Message> messages) {
        super(context, 0, messages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvText = (TextView) convertView.findViewById(R.id.text);
        tvName.setText(message.username);
        tvText.setText(message.body);
        return convertView;
    }
}
