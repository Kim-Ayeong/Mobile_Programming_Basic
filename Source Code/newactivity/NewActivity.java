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

   // ��� ���� �κ��� finish() �Լ��� �ű�
   public void onClickBack(View v) {
//    Intent intent = new Intent();
//    intent.putExtra("count", count);
//    setResult(RESULT_OK, intent);
      finish();
   }

   // Back ��ư�� ������ ���� ����� �����ϱ� ���� finish �Լ��� override �Ͽ� ��� ����
   @Override
   public void finish() {
      Intent intent = new Intent();
      intent.putExtra("count", count);
      setResult(RESULT_OK, intent);
      super.finish();         // �� �θ��� finish() �Լ��� �������� ȣ���ؾ���.
   }
}