package com.example.june.activityswitch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

   int count = 0;
   TextView textView;
   LinearLayout linearLayout;
   TextView list;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      textView = (TextView)findViewById(R.id.textView);
      linearLayout = (LinearLayout)findViewById(R.id.linearLayout);

      list = (TextView)findViewById(R.id.textView2);
      list.setText(list.getText().toString() + "\nonCreate");
   }

   public void onClickButton(View v) {
      count++;
      textView.setText(String.valueOf(count));
   }

   @Override
   protected void onSaveInstanceState(Bundle outState) {
      super.onSaveInstanceState(outState);
      list.setText(list.getText().toString() + "\nonSaveInstance");

      outState.putInt("count", count);
      outState.putString("list", list.getText().toString());
   }

   @Override
   protected void onRestoreInstanceState(Bundle savedInstanceState) {
      super.onRestoreInstanceState(savedInstanceState);

      count = savedInstanceState.getInt("count");
      list.setText(savedInstanceState.getString("list") + "\nonRestoreInstance");
   }

   @Override
   protected void onPause() {
      super.onPause();
      list.setText(list.getText().toString() + "\nonPause");
   }

   @Override
   protected void onStart() {
      super.onStart();
      list.setText(list.getText().toString() + "\nonStart");
   }

   @Override
   protected void onRestart() {
      super.onRestart();
      list.setText(list.getText().toString() + "\nonRestart");
   }

   @Override
   protected void onResume() {
      super.onResume();
      list.setText(list.getText().toString() + "\nonResume");
   }

   @Override
   protected void onStop() {
      super.onStop();
      list.setText(list.getText().toString() + "\nonStop");
   }

   @Override
   protected void onDestroy() {
      super.onDestroy();
      list.setText(list.getText().toString() + "\nonDestroy");
   }
}