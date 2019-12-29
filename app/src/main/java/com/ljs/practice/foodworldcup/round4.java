package com.ljs.practice.foodworldcup;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
public class round4 extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    int[] imgs = {R.drawable.food1, R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,
            R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10,R.drawable.food11,R.drawable.food12,R.drawable.food13,
            R.drawable.food14,R.drawable.food15,R.drawable.food16};
    final static round8 round8 = new round8();
    public static int[] r4 = round8.r4;
    public static int count3=2;
    public static int[] r2 = new int[2];
    public static int c=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round4);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        image1.setImageResource(imgs[r4[0]]);
        image2.setImageResource(imgs[r4[1]]);

    }
}
