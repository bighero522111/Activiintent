package com.example.asus.activiintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    TextView text;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView)findViewById(R.id.text);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            data = bundle.getString("data");
            text.setText(data);
        }

    }
}
