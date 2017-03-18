package com.example.nisandkb.smsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phn,msg;
    Button send;
    SmsManager smsManager;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phn = (EditText) findViewById(R.id.editText);
        msg = (EditText) findViewById(R.id.editText2);
        send = (Button) findViewById(R.id.button);

        smsManager = SmsManager.getDefault();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = phn.getText().toString();
                s2 = msg.getText().toString();
                //Sends SMS
                smsManager.sendTextMessage(s1,null,s2,null,null);
                Toast.makeText(getApplicationContext(),"Message Sent",Toast.LENGTH_LONG).show();
            }
        });



    }
}