package com.example.minoru.fashion;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by minoru on 2017/10/17.
 */

public class MyCamera extends AppCompatActivity{

    private Button Shutter;
    private FileOrder CameraFile;
    private Camera Mycamera;

    public Context CamContext;
    SurfaceView rootView_;
    ImageView surfaceView_;

    private final static int RESULT_CAMERA = 1001;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);

        imageView = (ImageView) findViewById(R.id.surface_view);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RESULT_CAMERA);

//        Log.d("Button","camera started");

        Button cameraButton = (Button)findViewById(R.id.ShutterButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_CAMERA);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RESULT_CAMERA) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
