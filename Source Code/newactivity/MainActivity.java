package com.example.june.newactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
   int count = 0;
   TextView textView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      textView = (TextView)findViewById(R.id.textView);
   }

   public void onClickButton(View v) {
      count++;
      textView.setText(String.valueOf(count));
   }

   public void onClickNewActivity(View v) {
      Intent intent = new Intent(this, NewActivity.class);
      intent.putExtra("count", count);
      startActivityForResult(intent, 1);
   }

   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      super.onActivityResult(requestCode, resultCode, data);
      if(requestCode != 1) {
         Toast.makeText(this, "Wrong Request Code: " + requestCode, Toast.LENGTH_SHORT).show();
         return;
      }
      if(resultCode != RESULT_OK) {
         return;
      }

      count = data.getIntExtra("count", -1);
      textView.setText(String.valueOf(count));
   }
}