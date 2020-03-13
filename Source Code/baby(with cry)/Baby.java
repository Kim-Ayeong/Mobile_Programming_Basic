package com.example.june.baby;

import android.widget.Toast;

/**
 * Created by June on 2017-05-11.
 */

public class Baby extends Person {
   Baby(String name, MainActivity mainActivity) {
      super(name, mainActivity);
   }

   void cry() {
      Toast.makeText(mainActivity, name + "이(가) " + "웁니다.", Toast.LENGTH_SHORT).show();
   }
}