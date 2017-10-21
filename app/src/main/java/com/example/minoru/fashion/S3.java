package com.example.minoru.fashion;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by minoru on 2017/10/22.
 */

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;


import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;


    public class S3
            extends AsyncTask<String, Integer, Boolean> {

        final String MY_ACCESS_KEY_ID = "...";
        final String MY_SECRET_KEY = "...";
        final String MY_PICTURE_BUCKET = "mybucket";

        final String TAG = "S3UP";
        Context context;
        String path;
        String keyName;


        public S3(
                Context context, String path, String keyName) {
            this.context = context;
            this.path = path;
            this.keyName = keyName;
        }

        @Override
        protected Boolean doInBackground(String... arg0) {

            Boolean ret = Boolean.FALSE;

            Log.d(TAG, "Start uploadFile");

            try {

                AmazonS3Client s3Client = new AmazonS3Client(
                        new BasicAWSCredentials(
                                MY_ACCESS_KEY_ID, MY_SECRET_KEY ) );
                PutObjectRequest por = new PutObjectRequest(
                        MY_PICTURE_BUCKET,
                        keyName,
                        new java.io.File(path) );
                s3Client.putObject(por);
                s3Client.setObjectAcl(
                        MY_PICTURE_BUCKET,
                        keyName,
                        CannedAccessControlList.PublicRead);

                ret = Boolean.TRUE;
            }
            catch(Exception ex){
                Log.d(TAG, ex.getMessage());
            }

            Log.d(TAG, "Exit uploadFile");

            return ret;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            Toast.makeText(context,
                    "result = " + result.toString(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}
