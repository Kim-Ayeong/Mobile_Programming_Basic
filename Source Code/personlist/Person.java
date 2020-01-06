package com.example.june.personlist;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by June on 2017-06-15.
 */

public class Person {
   Activity activity;
   String name;

   Person(Activity activity, String name) {
      this.activity = activity;
      this.name = name;
   }

   public void walk() {
      Toast.makeText(activity, "Walk", Toast.LENGTH_SHORT).show();
   }
}