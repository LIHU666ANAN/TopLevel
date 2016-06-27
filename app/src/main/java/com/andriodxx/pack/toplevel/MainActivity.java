package com.andriodxx.pack.toplevel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MainActivity
        tv_show =(TextView)findViewById(R.id.tv_show);
        tv_show.setText("这是字");
    }
}
