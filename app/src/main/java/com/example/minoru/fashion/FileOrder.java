package com.example.minoru.fashion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by minoru on 2017/10/18.
 */

public class FileOrder extends AppCompatActivity {


    private Context context;
    private String dirname="MyClothes";
    private String filePath = context.getFilesDir().getPath();
    private File file;

    public FileOrder(){
        makeDirectory();
    }

    //make directory
    protected void makeDirectory(){
        file = new File(filePath,dirname);
        if(!file.exists()){
            if(file.mkdir())
                Log.i("dirTAG","successed make directory !");
            else
                Log.i("dirTAG","missed make directory ...");
        }
    }

    //rename path
    protected void updatePath(String _nextDire){
        filePath=filePath+"./"+dirname;
        dirname = _nextDire;
    }


    protected void saveFile(String filename, String str) {
        FileOutputStream fileOutputstream = null;

        try {
//            fileOutputstream = openFileOutput(filename, Context.MODE_PRIVATE);
            FileOutputStream output = new FileOutputStream(filePath);
            fileOutputstream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected String readFile(String filename) {
        FileInputStream fileInputStream;
        String text = null;

        try {
            fileInputStream = openFileInput(filename);
            String lineBuffer = null;

            BufferedReader reader= new BufferedReader(new InputStreamReader(fileInputStream,"UTF-8"));
            while( (lineBuffer = reader.readLine()) != null ) {
                text = lineBuffer ;
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
