package com.kimjio.sample.myphonenumber;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myPhoneNumber = getPhoneNumber();
        TextView textView = (TextView) findViewById(R.id.textViewPhone);
        if(myPhoneNumber == null) {
            textView.setText(android.R.string.unknownName);
        } else {
            textView.setText(myPhoneNumber);
        }
    }

    public String getPhoneNumber() {
        TelephonyManager mgr = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        return mgr.getLine1Number();
    }
}
