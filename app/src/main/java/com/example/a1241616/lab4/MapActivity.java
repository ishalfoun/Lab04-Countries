package com.example.a1241616.lab4;

import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {
    EditText input;
    TextView errors;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        input = (EditText) findViewById(R.id.input);
        errors = (TextView) findViewById(R.id.tvErrors);

        value = getIntent().getExtras().getString("DATA1");
        input.setText(value);

    }

    public void openMaps(View v)
    {
        if (input.getText().length()==0)
        {
            errors.setText(R.string.noData);
            errors.setTextColor(Color.RED);
        }
        else {
            MainActivity.logIt("DATA1 " + value);
            errors.setText("");
            errors.setTextColor(Color.MAGENTA);
            Uri myUri2 = Uri.parse("geo:0,0?q=" + Uri.encode(input.getText().toString()));

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(myUri2);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }
    public void search(View v)
    {
        if (input.getText().length()==0)
        {
            errors.setText(R.string.noData);
            errors.setTextColor(Color.RED);
        }
        else {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, input.getText());
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }
}
