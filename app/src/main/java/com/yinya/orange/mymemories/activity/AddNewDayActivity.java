package com.yinya.orange.mymemories.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.yinya.orange.mymemories.R;

public class AddNewDayActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_day);

        initView();

    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Add New Anniversary");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView img = (ImageView) findViewById(R.id.img_card_view_properties);

        Glide.with(this).load("http://yesofcorsa.com/wp-content/uploads/2016/12/4k-Love-Wallpaper-Download.jpg")
                .fitCenter().into(img);

        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        TextView tv_description = (TextView) findViewById(R.id.tv_description);
        TextView tv_data_from = (TextView) findViewById(R.id.tv_data_from);
        TextView tv_data_to = (TextView) findViewById(R.id.tv_data_to);

        ImageView img_edit_title = (ImageView) findViewById(R.id.img_edit_title);
        ImageView img_edit_description = (ImageView) findViewById(R.id.img_edit_description);
        ImageView img_edit_data_from = (ImageView) findViewById(R.id.img_edit_data_from);
        ImageView img_edit_data_to = (ImageView) findViewById(R.id.img_edit_data_to);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_edit_title:
                break;
            case R.id.img_edit_description:
                break;
            case R.id.img_edit_data_from:
                break;
            case R.id.img_edit_data_to:
                break;

        }


    }
}
