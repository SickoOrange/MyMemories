package com.yinya.orange.mymemories.activity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.orhanobut.logger.Logger;
import com.yinya.orange.mymemories.R;

import java.util.Calendar;

public class AddNewDayActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mContext;
    private TextView tv_title;
    private TextView tv_description;
    private TextView tv_data_from;
    private TextView tv_data_to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_day);

        mContext = this.getApplicationContext();

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

        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_description = (TextView) findViewById(R.id.tv_description);
        tv_data_from = (TextView) findViewById(R.id.tv_data_from);
        tv_data_to = (TextView) findViewById(R.id.tv_data_to);

        ImageView img_edit_title = (ImageView) findViewById(R.id.img_edit_title);
        img_edit_title.setOnClickListener(this);
        ImageView img_edit_description = (ImageView) findViewById(R.id.img_edit_description);
        img_edit_description.setOnClickListener(this);
        ImageView img_edit_data_from = (ImageView) findViewById(R.id.img_edit_data_from);
        img_edit_data_from.setOnClickListener(this);
        ImageView img_edit_data_to = (ImageView) findViewById(R.id.img_edit_data_to);
        img_edit_data_to.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Calendar calendar = Calendar.getInstance();
        switch (view.getId()) {
            case R.id.img_edit_title:
                final BottomSheetDialog edit_title_dialog = new BottomSheetDialog(AddNewDayActivity.this);
                View titleView = this.getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
                edit_title_dialog.setContentView(titleView);
                ImageView img = titleView.findViewById(R.id.bottom_sheet_img);
                Glide.with(this).load("http://www.publicdomainpictures.net/pictures/40000/velka/love-message-1359191364iX3.jpg")
                        .fitCenter().into(img);

                final EditText bs_editText = titleView.findViewById(R.id.bottom_sheet_et);
                Button btn_cancel = titleView.findViewById(R.id.btn_bottom_sheet_cancel);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edit_title_dialog.dismiss();
                    }
                });
                Button btn_ok = titleView.findViewById(R.id.btn_bottom_sheet_ok);
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String title = bs_editText.getText().toString();
                        tv_title.setText("Title: " + title);
                        edit_title_dialog.dismiss();
                    }
                });
                edit_title_dialog.show();

                break;
            case R.id.img_edit_description:
                final BottomSheetDialog edit_description_dialog = new BottomSheetDialog(AddNewDayActivity.this);
                View descriptionView = this.getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
                edit_description_dialog.setContentView(descriptionView);
                ImageView desImg = descriptionView.findViewById(R.id.bottom_sheet_img);
                Glide.with(this).load("http://www.publicdomainpictures.net/pictures/40000/velka/love-message-1359191364iX3.jpg")
                        .fitCenter().into(desImg);

                TextView hint_text = descriptionView.findViewById(R.id.tv_set_title_hint);
                hint_text.setText("enter the description for the anniversary");

                final EditText des_editText = descriptionView.findViewById(R.id.bottom_sheet_et);
                Button des_cancel = descriptionView.findViewById(R.id.btn_bottom_sheet_cancel);
                des_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        edit_description_dialog.dismiss();
                    }
                });
                Button des_ok = descriptionView.findViewById(R.id.btn_bottom_sheet_ok);
                des_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String title = des_editText.getText().toString();
                        tv_description.setText("Description: " + title);
                        edit_description_dialog.dismiss();
                    }
                });
                edit_description_dialog.show();
                break;
            case R.id.img_edit_data_from:
                DatePickerDialog dateFromPickerDialog = new DatePickerDialog(AddNewDayActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        Logger.e(i + " " + i1 + " " + i2);
                        String dataFrom = i + "-" + i1 + "-" + i2;
                        tv_data_from.setText(tv_data_from.getText() + " " + dataFrom);
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                dateFromPickerDialog.show();
                break;
            case R.id.img_edit_data_to:
                DatePickerDialog dateEndPickerDialog = new DatePickerDialog(AddNewDayActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        Logger.e(i + " " + i1 + " " + i2);
                        String dataFrom = i + "-" + i1 + "-" + i2;
                        tv_data_to.setText(tv_data_from.getText() + " " + dataFrom);
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                dateEndPickerDialog.show();
                break;

        }


    }
}
