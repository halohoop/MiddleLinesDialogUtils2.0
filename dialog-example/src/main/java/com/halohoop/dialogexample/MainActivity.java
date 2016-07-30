package com.halohoop.dialogexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.halohoop.middlelinesdialogutilslib.dialogs.ActionClickListener;
import com.halohoop.middlelinesdialogutilslib.dialogs.MiddleLinesDialogUtils;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener, ActionClickListener {

    private TextView tv;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv.setOnClickListener(this);
        tv2.setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.tv:
                MiddleLinesDialogUtils.show(view.getId(), this, this, "LOL", "Machine", "Minicrack", "Soccer");
                break;
            case R.id.tv2:
                MiddleLinesDialogUtils.show(view.getId(), this, 20, 30,
                        20, 20,
                        0,
                        1.0f, "ffffff",
                        0.3f, "000000",
                        1.0f, "000000",
                        Gravity.CENTER, 10,
                        this,
                        new int[]{0, 2},
                        "Upload File", "Take Picture", "Parse The QRcode from Picture");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(2000);//simulation of sth is done in thread!
                        MiddleLinesDialogUtils.showItemByIndex(view.getId(), 0);
                        SystemClock.sleep(2000);//simulation of sth is done in thread!
                        MiddleLinesDialogUtils.showItemByIndex(view.getId(), 2);
                    }
                }).start();
                break;
        }
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
