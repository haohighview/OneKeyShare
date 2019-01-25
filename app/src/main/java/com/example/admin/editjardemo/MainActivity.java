package com.example.admin.editjardemo;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0; i<10; i++)
        {
            if(i==5)
                return;
        }
        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
    }
}
