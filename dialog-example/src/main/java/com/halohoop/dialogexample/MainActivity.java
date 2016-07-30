package com.halohoop.dialogexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.halohoop.middlelinesdialogutilslib.dialogs.ActionClickListener;
import com.halohoop.middlelinesdialogutilslib.utils.MiddleLinesDialogUtils;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener, ActionClickListener {

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
        MiddleLinesDialogUtils.show(view.getId(), this, this, "photos", "videos", "upload");
    }

    @Override
    public void onClick(int position, int resIdDialogBelongTo) {
        Log.i("Halohoop", "already click position:" + position);
    }

    @Override
    public void onCancel(DialogInterface var1, int resIdDialogBelongTo) {
        Log.i("Halohoop", "cancel + " + resIdDialogBelongTo);
    }

    @Override
    public void onClose(int resIdDialogBelongTo) {
        Log.i("Halohoop", "onClose + " + resIdDialogBelongTo);
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        Log.i("Halohoop", "cancel");
    }
}
