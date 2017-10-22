package com.example.riddl.fashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.ImageButton;

/**
 * Created by riddl on 2017/10/22.
 */

public class Bottoms extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottomslayout);

        Button returnButton = (Button) findViewById(R.id.Return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CordeActivity.class);
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

        Button shoesButton = (Button) findViewById(R.id.Shoes);
        shoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Shoes.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton selectbottomsButton = (ImageButton) findViewById(R.id.bottoms1);
        selectbottomsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Shoes.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
