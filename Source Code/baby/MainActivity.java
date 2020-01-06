package com.example.mp.baby;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreate(View v) {
        EditText editTextName = (EditText)findViewById(R.id.editTextName);

        // RadioButton
        RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

        if(radioButton1.isChecked()) {          // 사람 버튼 검사
            person = new Person(editTextName.getText().toString(), this);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.person);
        }
        else if(radioButton2.isChecked()) {     // 아기 버튼 검사
            person = new Baby(editTextName.getText().toString(), this);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.baby);
        }

    }

    public void onClickWalk(View v) {
        person.walk(3);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person_walk);
    }

    public void onClickRun(View v) {
        person.run(10);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person_run);
    }

    public void onClickStop(View v) {
        person.stop();
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person);
    }
}
