package com.annagreenfoxacademy.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    static final String id = "CsabaRudiAnna";
    private ArrayList<Message> messages;
    ChatAdapter myAdapter;
    MessageService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messages = new ArrayList<>();
        Message wtf = new Message(id, "wtf");
        messages.add(wtf);

        myAdapter = new ChatAdapter(MainActivity.this, messages);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://zerda-raptor.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MessageService.class);
        service.getMessageCall().enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                myAdapter.clear();
                myAdapter.addAll(response.body());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {

            }
        });
    }

    public void sendMessage(View view) {
        final EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();
        Message message2 = new Message(id, text);
        myAdapter.add(message2);

        service.postMessageCall(new MessageWrapper(message2)).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                editText.setText("");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}