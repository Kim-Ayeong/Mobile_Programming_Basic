package com.example.mp.baby;


import android.widget.Toast;

public class Person {
    String name;
    MainActivity mainActivity;

    Person(String name, MainActivity mainActivity) {
        this.name = name;
        this.mainActivity = mainActivity;

        Toast.makeText(mainActivity, name + " 생성", Toast.LENGTH_SHORT).show();
    }

    public void walk(int speed) {
//        System.out.println("사람이 " + speed + "km 속도로 걸어갑니다.");
        Toast.makeText(mainActivity, name + "이(가) " + speed + "km 속도로 걸어갑니다.", Toast.LENGTH_SHORT).show();
    }

    public void run(int speed) {
//        System.out.println("사람이 " + speed + "km 속도로 뛰어갑니다.");
        Toast.makeText(mainActivity, name + "이(가) " + speed + "km 속도로 뛰어갑니다.", Toast.LENGTH_SHORT).show();
    }

    public void stop() {
        Toast.makeText(mainActivity, name + "이(가) " + "정지합니다.", Toast.LENGTH_SHORT).show();
    }
}
