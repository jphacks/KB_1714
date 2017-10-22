package com.example.riddl.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.regions.Region;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

import java.util.Date;
//

public class MainActivity extends AppCompatActivity {

    private Books book;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cordeButton = (Button) findViewById(R.id.Corde);
        cordeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CordeActivity.class);
                startActivity(intent);
            }
        });

        // (1) Cognitoで出力した認証定義です
        CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                getApplicationContext(),
                "us-east-2:9353876d-fc89-45a8-b47e-107b9ff847d2", // ID プールの ID
                Regions.AP_NORTHEAST_1 // Region
        );

        // (2) DynamoDBのクライアントセッションを作成します
        AmazonDynamoDBClient ddbClient = new AmazonDynamoDBClient(credentialsProvider);

        // (3) デフォルトではUS-EASTがリージョンで指定されてしまうため意図的にAP_NORTHEASTにしています
        Region apNortheast1 = Region.getRegion(Regions.AP_NORTHEAST_1);
        ddbClient.setRegion(apNortheast1);

        // (4) マッパーのインスタンス作成
        final DynamoDBMapper mapper = new DynamoDBMapper(ddbClient);

        // (5) インターネットのアクセスを行うためにスレッドを作成し、その中でインサート処理を定義します
        runnable = new Runnable() {
            public void run() {
                Books book = new Books();
                book.setAuthor("Charles Dickens");
                book.setTitle("Great Expectations");
                book.setPrice(20000);
                Date date = new Date();
                book.setReleasedate(date.toString());
                mapper.save(book);
            };
        };

        Thread mythread = new Thread(runnable);
        mythread.start();

    }
}
