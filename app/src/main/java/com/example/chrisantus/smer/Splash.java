package com.example.chrisantus.smer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

/**
 * Created by chrisantus on 2018. 5. 12..
 */

public class Splash extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.first);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, PriceActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


}
