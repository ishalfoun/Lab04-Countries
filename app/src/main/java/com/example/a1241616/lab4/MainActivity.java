package com.example.a1241616.lab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showMap(View v) {

       // Uri   myUri1 = Uri.parse("geo:45.489374,-73.588298?q=" + Uri.encode("3040 Sherbrooke St ndW"));
        Uri   myUri2 = Uri.parse("geo:0,0?q=" + Uri.encode(getString(R.string.country)));
        //String s = getString(R.string.country);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(myUri2);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
