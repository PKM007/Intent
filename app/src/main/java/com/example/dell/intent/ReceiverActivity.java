package com.example.dell.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reciever_activity);
        text=(TextView)findViewById(R.id.text);
        Intent i=getIntent();
        String rMessage=i.getDataString();
        text.setText(rMessage);

    }
}
