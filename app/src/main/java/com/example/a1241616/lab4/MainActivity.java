package com.example.a1241616.lab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void launchActivity2(View view) {
        Intent i = new Intent(this, MapActivity.class);

        logIt(getString(R.string.country));
        i.putExtra("DATA1", getString(R.string.country));
        startActivity(i);

    }

    public static void logIt(String msg) {
        final String TAG = "INTDATA1";
        Log.d(TAG, msg);
    }

}
