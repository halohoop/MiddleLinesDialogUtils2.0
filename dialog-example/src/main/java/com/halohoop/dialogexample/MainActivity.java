package com.halohoop.dialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.halohoop.middlelinesdialogutilslib.dialogs.ItemClickListener;
import com.halohoop.middlelinesdialogutilslib.utils.MiddleLinesDialogUtils;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener, ItemClickListener {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        tv.setText("already click!");
        MiddleLinesDialogUtils.show(view.getId(), this, this, "photos", "videos","upload");
    }

    @Override
    public void onClick(int position, int resIdDialogBelongTo) {
        tv.setText("already click position:" + position);
    }
}
