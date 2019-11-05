package com.noodle.recyclerbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.library.banner.BannerLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerLayout recyclerBanner =  findViewById(R.id.recycler);
        List<String> list = new ArrayList<>();
        list.add("http://pic1.win4000.com/mobile/2019-11-04/5dbfe482f0aaf.jpg");
        list.add("http://pic1.win4000.com/mobile/2019-11-04/5dbfe4839f968.jpg");
        list.add("http://pic1.win4000.com/mobile/2019-11-04/5dbfe484540c5.jpg");

        WebBannerAdapter webBannerAdapter=new WebBannerAdapter(this,list);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了第  " + position+"  项", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerBanner.setAdapter(webBannerAdapter);
    }


}
