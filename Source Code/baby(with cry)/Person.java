package com.example.june.baby;

import android.widget.Toast;

/**
 * Created by June on 2017-05-11.
 */

public class Person {
   String name;
   MainActivity mainActivity;

   Person(String name, MainActivity mainActivity) {
      this.name = name;
      this.mainActivity = mainActivity;

      Toast.makeText(mainActivity, name + " ����", Toast.LENGTH_SHORT).show();
   }

   public void walk(int speed) {
//        System.out.println("����� " + speed + "km �ӵ��� �ɾ�ϴ�.");
      Toast.makeText(mainActivity, name + "��(��) " + speed + "km �ӵ��� �ɾ�ϴ�.", Toast.LENGTH_SHORT).show();
   }

   public void run(int speed) {
//        System.out.println("����� " + speed + "km �ӵ��� �پ�ϴ�.");
      Toast.makeText(mainActivity, name + "��(��) " + speed + "km �ӵ��� �پ�ϴ�.", Toast.LENGTH_SHORT).show();
   }

   public void stop() {
      Toast.makeText(mainActivity, name + "��(��) " + "�����մϴ�.", Toast.LENGTH_SHORT).show();
   }
}