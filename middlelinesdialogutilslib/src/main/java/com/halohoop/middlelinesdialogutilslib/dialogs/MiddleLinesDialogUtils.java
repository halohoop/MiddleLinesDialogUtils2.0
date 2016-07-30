package com.halohoop.middlelinesdialogutilslib.dialogs;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pooholah on 2016/7/15.
 */
public class MiddleLinesDialogUtils {
    private static Map<Integer, MiddleLinesDialog> dialogMap = new HashMap<>();

    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, actionClickListener, texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    public static void show(int resIdDialogBelongTo, Context context, ActionClickListener actionClickListener,
                            int[] waitingToShowMark,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context,
                actionClickListener,
                waitingToShowMark,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, actionClickListener, texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown, actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int radius, ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown, radius,
                actionClickListener, texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius, actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    //--------------------------------↑-------------------------------
    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            float textColorAlpha, String textColorHex,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                textColorAlpha, textColorHex,
                actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }
    //--------------------------------↑-------------------------------

    //---------------------------------↓------------------------------
    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            float textColorAlpha, String textColorHex,
                            int itemGravity, int padding,
                            ActionClickListener actionClickListener,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                textColorAlpha, textColorHex,
                itemGravity, padding,
                actionClickListener,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }

    public static void show(int resIdDialogBelongTo, Context context, int marginLeftAndRight, int itemPaddingTopAndDown,
                            int topLeftAndRightRadius, int bottomLeftAndRightRadius,
                            int crossMarginLeftAndRight,
                            float dialogBgAlpha, String dialogBgColorHex,
                            float crossColorAlpha, String crossColorHex,
                            float textColorAlpha, String textColorHex,
                            int itemGravity, int padding,
                            ActionClickListener actionClickListener,
                            int[] waitingToShowMark,
                            String... texts) {
        MiddleLinesDialog middleLinesDialog = new MiddleLinesDialog(resIdDialogBelongTo, context, marginLeftAndRight, itemPaddingTopAndDown,
                topLeftAndRightRadius, bottomLeftAndRightRadius,
                crossMarginLeftAndRight,
                dialogBgAlpha, dialogBgColorHex,
                crossColorAlpha, crossColorHex,
                textColorAlpha, textColorHex,
                itemGravity, padding,
                actionClickListener,
                waitingToShowMark,
                texts);
        middleLinesDialog.show();
        dialogMap.put(resIdDialogBelongTo, middleLinesDialog);
    }
    //--------------------------------↑-------------------------------

    public static void showItemByIndex(int resIdDialogBelongTo, int lineIndex) {
        MiddleLinesDialog middleLinesDialog = dialogMap.get(resIdDialogBelongTo);
        if (middleLinesDialog != null) {
            middleLinesDialog.showItem(lineIndex);
        }
    }

    protected static MiddleLinesDialog remove(int resIdDialogBelongTo) {
        return dialogMap.remove(resIdDialogBelongTo);
    }

}
