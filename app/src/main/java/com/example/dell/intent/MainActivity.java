package com.example.dell.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);
        editText=(EditText)findViewById(R.id.text);
    }

    public  void sender(View v)
    {
        String message=editText.getText().toString();
        Intent i=new Intent(this,ReceiverActivity.class);
        i.setData(Uri.parse(message));
        startActivity(i);
    }

    public  void sendEmail(View v)
    {
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] array={"prakhar.prakhar.mishra1@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL,array);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
        String message=editText.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT,message);
        if(i.resolveActivity(getPackageManager())!=null)
        {
            startActivity(i);
        }
    }

}
