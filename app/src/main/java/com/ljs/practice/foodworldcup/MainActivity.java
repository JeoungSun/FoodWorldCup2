package com.ljs.practice.foodworldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
   int[] imgs = {R.drawable.food1, R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,
            R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10,R.drawable.food11,R.drawable.food12,R.drawable.food13,
            R.drawable.food14,R.drawable.food15,R.drawable.food16};
   public static int[] r8 = new int[8];
   public static int a=0;

    ImageView image1;
    ImageView image2;
   public static int count=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

       image1.setOnClickListener(new View.OnClickListener() {
           Intent intent1 = new Intent(getApplicationContext(), round8.class);
           @Override
           public void onClick(View view) {
               if(count>15){
                   r8[a] = count - 2;
                   count=0;
                   intent1.putExtra("key", r8);
                   startActivity(intent1);
               }
               image1.setImageResource(imgs[count]);
               image2.setImageResource(imgs[1 + count]);
               r8[a] = count - 2;
               count += 2;
               a ++;

           }
       });

       image2.setOnClickListener(new View.OnClickListener() {
           Intent intent1 = new Intent(getApplicationContext(), round8.class);
           @Override
           public void onClick(View view) {

               if(count>15){
                  r8[a] = count - 1;
                   Log.d(TAG, "onClick: "+ r8[7]);
                   count=0;
                   intent1.putExtra("key", r8);
                   startActivity(intent1);
               }
               image1.setImageResource(imgs[count]);
               image2.setImageResource(imgs[1 + count]);
               r8[a] = count - 1;
               count += 2;
               a ++;

           }
       });


    }



}
