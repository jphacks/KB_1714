package com.example.riddl.fashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.ImageButton;
import android.widget.Toast;
/**
 * Created by riddl on 2017/10/22.
 */

public class Select extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout);

        Button returnButton = (Button) findViewById(R.id.Return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CordeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button sendButton = (Button) findViewById(R.id.Bottoms);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Bottoms.class);
                finish();
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
        ImageButton selecttopsButton = (ImageButton) findViewById(R.id.tops1);
        selecttopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Bottoms.class);
                startActivity(intent);
                finish();
            }
        });




    }
}