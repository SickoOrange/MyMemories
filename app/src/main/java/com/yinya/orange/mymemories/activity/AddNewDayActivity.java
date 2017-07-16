package com.yinya.orange.mymemories.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.yinya.orange.mymemories.R;

public class AddNewDayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_day);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("add new countdown");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView img = (ImageView) findViewById(R.id.img_card_view_properties);

        Glide.with(this).load("http://yesofcorsa.com/wp-content/uploads/2016/12/4k-Love-Wallpaper-Download.jpg")
                .fitCenter().into(img);
    }

}
