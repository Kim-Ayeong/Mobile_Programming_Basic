package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    Person person;
    String name;
    public static int countP,countB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreate(View v) {
        EditText editTextName = (EditText)findViewById(R.id.editText);

        // RadioButton
        RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

        if(radioButton1.isChecked()) {          // 사람 버튼 검사
            name = editTextName.getText().toString();
            if(name.equals("")){
                Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
            }
            else {
                countP++;
                person = new Person(name, this);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.person);
                editTextName.setText("");
            }
        }
        else if(radioButton2.isChecked()) {     // 아기 버튼 검사
            name = editTextName.getText().toString();
            if(name.equals("")){
                Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
            }
            else {
                countB++;
                person = new Baby(name, this);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.baby);
                editTextName.setText("");
            }
        }

        else{
            Toast.makeText(this,"어른/아이 중 하나를 선택하세요.",Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickWalk(View v) {
        if(name.equals("")){
            Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
        }
        else {
            person.walk(3);
        }
    }

    public void onClickRun(View v) {
        if(name.equals("")) {
            Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
        }
        else {
            person.run(10);
        }
    }

    public void onClickStop(View v) {
        if(name.equals("")){
            Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
        }
        else {
            person.stop();
        }
    }

    public void onClickCry(View v) {
        if(name.equals("")){
            Toast.makeText(this,"이름을 입력하세요",Toast.LENGTH_SHORT).show();
        }
        else {
            person.cry();
        }
    }
}