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

      imageView = (ImageView)findViewById(R.id.imageView);        // ImageView �� ��ü�� ã��
      editText = (EditText)findViewById(R.id.editText);           // EditView�� ��ü�� ã��
   }

   public void onClickCreate(View v) {
      RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
      RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

      if(radioButton1.isChecked() == true) {                      // radioButton1 �� üũ�Ǿ��ִ��� �˻�
         p = new Person(editText.getText().toString(), this);    // Person ��ü ����
         imageView.setVisibility(View.VISIBLE);                  // �׸��� ���̰� ����
         imageView.setImageResource(R.drawable.person);          // �׸��� person.png�� ����
      }
      else if(radioButton2.isChecked() == true) {                 // radioButton2 �� üũ�Ǿ��ִ��� �˻�
         p = new Baby(editText.getText().toString(), this);      // Baby ��ü ����
         imageView.setVisibility(View.VISIBLE);                  // �׸��� ���̰� ����
         imageView.setImageResource(R.drawable.baby);            // �׸��� baby.png�� ����
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
         Toast.makeText(this, "Baby ��ü�� �ƴϾ cry�� ȣ���� �� �����ϴ�.", Toast.LENGTH_SHORT).show();
      }
   }
}