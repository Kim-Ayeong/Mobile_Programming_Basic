package com.example.mp.total;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    Person p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v) {
        p = new Person();
        TextView t = (TextView)findViewById(R.id.textView);
        t.setText(String.valueOf(Person.getTotal()));
    }
}