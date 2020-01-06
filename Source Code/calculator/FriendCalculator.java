package com.example.june.calculator;


import android.app.Activity;
import android.widget.Toast;

public class FriendCalculator implements Calculator {
   Activity activity;

   FriendCalculator(Activity activity) {
      this.activity = activity;
   }

   @Override
   public int add(int a, int b) {
      Toast.makeText(activity, String.valueOf(a + b), Toast.LENGTH_SHORT).show();
      return a + b;
   }

   @Override
   public int sub(int a, int b) {
      Toast.makeText(activity, String.valueOf(a - b), Toast.LENGTH_SHORT).show();
      return a - b;
   }

   @Override
   public int mul(int a, int b) {
      Toast.makeText(activity, String.valueOf(a * b), Toast.LENGTH_SHORT).show();
      return a * b;
   }

   @Override
   public double div(int a, int b) {
      Toast.makeText(activity, String.valueOf((double)a / b), Toast.LENGTH_SHORT).show();
      return (double)a / (double)b;
   }
}