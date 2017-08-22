package org.androidtown.tablayoutexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by kim on 2017-08-14.
 */
//초기대기화면
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//시간지정
        try {
            Thread.sleep(4000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

