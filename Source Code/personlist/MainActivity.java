package com.example.june.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
   int count = 0;
   String [] names = {"A", "B", "C", "D", "E"};
   Person [] persons = new Person[5];

   TextView textView;
   LinearLayout linearLayout;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      textView = (TextView)findViewById(R.id.textView);
      linearLayout = (LinearLayout)findViewById(R.id.linearLayout);
   }

   public void onClickButton(View v) {
      if(count >= persons.length) {
         Person[] tempPersons = new Person[persons.length + 5];
         System.arraycopy(persons, 0, tempPersons, 0, persons.length);
         persons = tempPersons;
      }
      persons[count] = new Person(this, names[count % 5]);

      TextView new_textView = new TextView(this);
      new_textView.setText(persons[count].name);
      new_textView.setTextSize(20);
      linearLayout.addView(new_textView);
      count ++;

      textView.setText(String.valueOf(count));
   }
}