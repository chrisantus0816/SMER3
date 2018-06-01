package com.example.chrisantus.smer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FridgeActivity extends AppCompatActivity {
    private LinearLayout mGallery1;
    private int[] mImgIds;
    private LayoutInflater mInflater;
    private HorizontalScrollView horizontalScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);
        mInflater = LayoutInflater.from(this);
        initData();
        initView1();


    }

    private void initData() {
        mImgIds = new int[]{R.drawable.butter, R.drawable.creami, R.drawable.fish, R.drawable.eggs};
    }

    private void initView1() {
        mGallery1 = (LinearLayout) findViewById(R.id.id_gallery);
        for (int i = 0; i < mImgIds.length; i++) {
            View view = mInflater.inflate(R.layout.activity_gallery_item,
                    mGallery1, false);
            ImageView img = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
            img.setImageResource(mImgIds[i]);
            TextView txt = (TextView) view.findViewById(R.id.id_index_gallery_item_text);
            txt.setText("Info " + i);
            mGallery1.addView(view);
        }
    }
}
