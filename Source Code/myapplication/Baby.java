package com.example.user.myapplication;


import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.user.myapplication.MainActivity.countB;


public class Baby extends Person {
    Baby(String name, MainActivity mainActivity) {
        super(name, mainActivity);
        TextView text = (TextView) mainActivity.findViewById(R.id.textView2);
        text.setText("아기 " + countB + "명");
    }

    public void cry() {
        Toast.makeText(mainActivity, name + "이(가) 웁니다.", Toast.LENGTH_LONG).show();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cry);
    }

    public void walk(int speed) {
        Toast.makeText(mainActivity, "아기는 걸을 수 없습니다.",Toast.LENGTH_SHORT).show();
    }

    public void run(int speed) {
        Toast.makeText(mainActivity, "아기는 뛸 수 없습니다.",Toast.LENGTH_SHORT).show();
    }

    public void stop() {
        Toast.makeText(mainActivity, name + "이(가) 울음을 멈춥니다.",Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.baby);
    }
}