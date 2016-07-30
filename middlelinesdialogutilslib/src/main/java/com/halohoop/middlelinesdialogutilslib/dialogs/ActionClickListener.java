package com.halohoop.middlelinesdialogutilslib.dialogs;

import android.content.DialogInterface;

/**
 * Created by Pooholah on 2016/7/15.
 */
public interface ActionClickListener extends DialogInterface.OnCancelListener {
    void onClick(int position, int resIdDialogBelongTo);

    void onCancel(DialogInterface dialogInterface, int resIdDialogBelongTo);

    void onCancel(DialogInterface dialogInterface);

    void onClose(int resIdDialogBelongTo);
}
