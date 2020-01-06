package com.example.june.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

   Calculator calculator;
   EditText input1;
   EditText input2;
   TextView output;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      calculator = new MyCalculator();

      input1 = (EditText)findViewById(R.id.editText1);
      input2 = (EditText)findViewById(R.id.editText2);
      output = (TextView)findViewById(R.id.textView);
   }

   public void onClickSwitch(View v) {
      if(calculator instanceof MyCalculator) {
         calculator = new FriendCalculator(this);
         Toast.makeText(this, "FriendCalculator", Toast.LENGTH_SHORT).show();
         Button b = (Button)findViewById(R.id.buttonSwitch);
         b.setText("FriendCalculator to MyCalculator");
      }
      else {
         calculator = new MyCalculator();
         Toast.makeText(this, "MyCalculator", Toast.LENGTH_SHORT).show();
         Button b = (Button)findViewById(R.id.buttonSwitch);
         b.setText("MyCalculator to FriendCalculator");
      }
   }

   public void onClickAdd(View v) {
      int a = Integer.parseInt(input1.getText().toString());
      int b = Integer.parseInt(input2.getText().toString());
      int c = calculator.add(a, b);
      output.setText(String.valueOf(c));
   }

   public void onClickSub(View v) {
      int a = Integer.parseInt(input1.getText().toString());
      int b = Integer.parseInt(input2.getText().toString());
      int c = calculator.sub(a, b);
      output.setText(String.valueOf(c));
   }

   public void onClickMul(View v) {
      int a = Integer.parseInt(input1.getText().toString());
      int b = Integer.parseInt(input2.getText().toString());
      int c = calculator.mul(a, b);
      output.setText(String.valueOf(c));
   }

   public void onClickDiv(View v) {
      int a = Integer.parseInt(input1.getText().toString());
      int b = Integer.parseInt(input2.getText().toString());
      double c = calculator.div(a, b);
      output.setText(String.valueOf(c));
   }
}