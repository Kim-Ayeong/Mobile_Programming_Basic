package com.example.june.calculator;


public class MyCalculator implements Calculator {
   @Override
   public int add(int a, int b) {
      return a + b;
   }

   @Override
   public int sub(int a, int b) {
      return a - b;
   }

   @Override
   public int mul(int a, int b) {
      return a * b;
   }

   @Override
   public double div(int a, int b) {
      return (double)a / (double)b;
   }
}