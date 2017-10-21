package com.example.minoru.fashion;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    private Button CameraButton;



    private final int CAMERA_PERMISSION = 1000;
    private static final int REQUEST_PERMISSION = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CameraButton = (Button)findViewById(R.id.button_Camera);

        Log.d("Instance","main success");

        CameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ボタンがクリックされた時に呼び出されます
//                MyCamera camera = new MyCamera();
                Log.d("Button","camera will start");

                Intent intent = new Intent(MainActivity.this, MyCamera.class);
//                intent.putExtra("DATA1",0);
                startActivity(intent);            }
        });}

    // permissionの確認
    public void checkPermission() {
        // 既に許可している
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED){
//            setUpWriteExternalStorage();
        }
        // 拒否していた場合
        else{
            requestLocationPermission();
        }
    }

    // 許可を求める
    private void requestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.CAMERA)) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},
                    REQUEST_PERMISSION);
        } else {
            Toast toast = Toast.makeText(this, "許可してください", Toast.LENGTH_SHORT);
            toast.show();

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA,},
                    REQUEST_PERMISSION);
        }
    }
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION) {
            // 使用が許可された
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                setUpWriteExternalStorage();
                return;

            } else {
                // それでも拒否された時の対応
                Toast toast = Toast.makeText(this, "何もできません", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
}


