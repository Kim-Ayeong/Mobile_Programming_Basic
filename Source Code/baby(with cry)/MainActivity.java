package com.example.june.baby;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
   Person p;
   ImageView imageView;
   EditText editText;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      imageView = (ImageView)findViewById(R.id.imageView);        // ImageView 의 객체를 찾음
      editText = (EditText)findViewById(R.id.editText);           // EditView의 객체를 찾음
   }

   public void onClickCreate(View v) {
      RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
      RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

      if(radioButton1.isChecked() == true) {                      // radioButton1 이 체크되어있는지 검사
         p = new Person(editText.getText().toString(), this);    // Person 객체 생성
         imageView.setVisibility(View.VISIBLE);                  // 그림을 보이게 설정
         imageView.setImageResource(R.drawable.person);          // 그림을 person.png로 변경
      }
      else if(radioButton2.isChecked() == true) {                 // radioButton2 이 체크되어있는지 검사
         p = new Baby(editText.getText().toString(), this);      // Baby 객체 생성
         imageView.setVisibility(View.VISIBLE);                  // 그림을 보이게 설정
         imageView.setImageResource(R.drawable.baby);            // 그림을 baby.png로 변경
      }
   }

   public void onClickWalk(View v) {
      p.walk(10);
      imageView.setImageResource(R.drawable.person_walk);
   }

   public void onClickRun(View v) {
      p.run(10);
      imageView.setImageResource(R.drawable.person_run);
   }

   public void onClickStop(View v) {
      p.stop();
      imageView.setImageResource(R.drawable.person);
   }

   public void onClickCry(View v) {
      if(p instanceof Baby) {
         ((Baby)p).cry();
         imageView.setImageResource(R.drawable.baby_cry);
      }
      else {
         Toast.makeText(this, "Baby 객체가 아니어서 cry를 호출할 수 없습니다.", Toast.LENGTH_SHORT).show();
      }
   }
}