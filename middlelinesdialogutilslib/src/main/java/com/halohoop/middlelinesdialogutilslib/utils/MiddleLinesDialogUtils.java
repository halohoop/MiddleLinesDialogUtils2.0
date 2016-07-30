package com.halohoop.middlelinesdialogutilslib.utils;

import android.content.Context;
import android.content.DialogInterface;

import com.halohoop.middlelinesdialogutilslib.dialogs.ActionClickListener;
import com.halohoop.middlelinesdialogutilslib.dialogs.MiddleLinesDialog;

/**
 * Created by Pooholah on 2016/7/15.
 */
public class MiddleLinesDialogUtils {

    public static void show(int resIdDialogBelongTo, Context context, ActionClickListener actionClickListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, actionClickListener, texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight,
                            ActionClickListener actionClickListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, actionClickListener, texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            ActionClickListener actionClickListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown, actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int radius, ActionClickListener actionClickListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown, radius,
                actionClickListener, texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            ActionClickListener actionClickListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius, actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius, actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            float textColorAlpha, String textColorHex,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                textColorAlpha, textColorHex,
                actionClickListener,
                texts).show();
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            float textColorAlpha, String textColorHex,
                            int itemGravity, int padding,
                            ActionClickListener actionClickListener,
                            DialogInterface.OnCancelListener cancelListener,
                            String... texts) {
        new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                textColorAlpha, textColorHex,
                itemGravity,padding,
                actionClickListener,
                texts).show();
    }


}
