package com.example.user.myapplication;


import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.user.myapplication.MainActivity.countP;

public class Person {
    String name;
    MainActivity mainActivity;

    Person(String name, MainActivity mainActivity) {
        this.name = name;
        this.mainActivity = mainActivity;

        Toast.makeText(mainActivity, name + " 생성", Toast.LENGTH_SHORT).show();
        TextView text = (TextView) mainActivity.findViewById(R.id.textView2);
        text.setText("어른 "+countP +"명");
    }

    public void walk(int speed) {
//        System.out.println("사람이 " + speed + "km 속도로 걸어갑니다.");
        Toast.makeText(mainActivity, name + "이(가) " + speed + "km 속도로 걸어갑니다.", Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.walk);
    }

    public void run(int speed) {
//        System.out.println("사람이 " + speed + "km 속도로 뛰어갑니다.");
        Toast.makeText(mainActivity, name + "이(가) " + speed + "km 속도로 뛰어갑니다.", Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.run);
    }

    public void stop() {
        Toast.makeText(mainActivity, name + "이(가) " + "정지합니다.", Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person);
    }

    public void cry() {
        Toast.makeText(mainActivity, "어른은 울 수 없습니다.", Toast.LENGTH_SHORT).show();
    }
}