package com.example.june.newactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity extends Activity {
   int count = 0;
   TextView textView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_new);

      textView = (TextView)findViewById(R.id.textView2);

      Intent intent = getIntent();
      count = intent.getIntExtra("count", -1);
      textView.setText(String.valueOf(count));
   }

   public void onClickButton(View v) {
      count++;
      textView.setText(String.valueOf(count));
   }

   // 결과 전송 부분을 finish() 함수로 옮김
   public void onClickBack(View v) {
//    Intent intent = new Intent();
//    intent.putExtra("count", count);
//    setResult(RESULT_OK, intent);
      finish();
   }

   // Back 버튼을 눌렀을 때도 결과를 전송하기 위해 finish 함수를 override 하여 결과 전송
   @Override
   public void finish() {
      Intent intent = new Intent();
      intent.putExtra("count", count);
      setResult(RESULT_OK, intent);
      super.finish();         // 꼭 부모의 finish() 함수를 마지막에 호출해야함.
   }
}