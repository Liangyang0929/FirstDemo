package com.weilaifu.android.firstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mButton= (TextView) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setText("develop");

                String tag="tag测试 tag  V2.0";
                String tag1="tag测试 打tag标签";

                int i=0;
                int j=0;
                int k=0;
                int z=0;
                String extra="master 再次提交";


                ImageView mImageView=new ImageView(MainActivity.this);
            }
        });
    }
}
