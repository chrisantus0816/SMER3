package com.example.chrisantus.smer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap.*;
public class PushIngredient extends Activity implements OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btnFridge;
    Button btn9, btn10, btn11, btn12, btnPush, btn14, btn15, btn16, btn17;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ingredient);

        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button4);
        btn4=findViewById(R.id.button5);
        btn5=findViewById(R.id.button6);
        btn6=findViewById(R.id.button7);
        btn7=findViewById(R.id.button8);
        btnFridge=findViewById(R.id.buttonFridge);
        btn8=findViewById(R.id.button9);
        btn9=findViewById(R.id.button10);
        btn10=findViewById(R.id.button11);
        btn11=findViewById(R.id.button12);
        btn12=findViewById(R.id.button13);
        btnPush=findViewById(R.id.button14);
        btn14=findViewById(R.id.button15);
        btn15=findViewById(R.id.button16);
        btn16=findViewById(R.id.button17);
        btn17=findViewById(R.id.button18);
        img1=findViewById(R.id.imageView);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btnPush.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button2:
                img1.setImageResource(R.drawable.onion);
                break;
            case R.id.button3:
                img1.setImageResource(R.drawable.pa);
                break;
            case R.id.button4:
                img1.setImageResource(R.drawable.cow);
                break;
            case R.id.button5:
                img1.setImageResource(R.drawable.pork);
                break;
            case R.id.button6:
                img1.setImageResource(R.drawable.eggs);
                break;
            case R.id.button7:
                img1.setImageResource(R.drawable.potato);
                break;
            case R.id.button8:
                img1.setImageResource(R.drawable.saewo);
                break;
            case R.id.button9:
                img1.setImageResource(R.drawable.tofu);
                break;
            case R.id.button10:
                img1.setImageResource(R.drawable.namul);
                break;
            case R.id.button11:
                img1.setImageResource(R.drawable.sikbang);
                break;
            case R.id.button12:
                img1.setImageResource(R.drawable.grarlic);
                break;
            case R.id.button13:
                img1.setImageResource(R.drawable.butter);
                break;
            case R.id.button14:

Intent freezerIntent=new Intent(getApplicationContext(),FreezerActivity.class);
                startActivity(freezerIntent);
                break;
            case R.id.button15:
                img1.setImageResource(R.drawable.milk);
                break;
            case R.id.button16:
                img1.setImageResource(R.drawable.cream);
                break;
            case R.id.button17:
                img1.setImageResource(R.drawable.kim);
                break;
            case R.id.button18:
                img1.setImageResource(R.drawable.fish);
                break;
            case R.id.buttonFridge:
                Intent fridgeIntent=new Intent(getApplicationContext(),FridgeActivity.class);
                startActivity(fridgeIntent);
                break;

            default:
                break;


        }
    }

}





