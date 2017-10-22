package com.example.riddl.fashion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by riddl on 2017/10/22.
 */

public class Shoes extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoeslayout);

        Button returnButton = (Button) findViewById(R.id.Return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CordeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button bottomsButton = (Button) findViewById(R.id.Bottoms);
        bottomsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Bottoms.class);
                startActivity(intent);
                finish();
            }
        });
        Button topsButton = (Button) findViewById(R.id.Tops);
        topsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Select.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton selectshoesButton = (ImageButton) findViewById(R.id.shoes1);
        selectshoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), TopsBottom.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
