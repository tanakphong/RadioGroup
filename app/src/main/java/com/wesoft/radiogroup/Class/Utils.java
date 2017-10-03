package com.wesoft.radiogroup.Class;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.wesoft.radiogroup.R;


/**
 * Created by USER275 on 9/6/2017.
 */

public class Utils {
    public static int setTheme(String theme) {
        if (theme.equals("Large")) {
            return R.style.Theme_Large;
        } else {
            return R.style.Theme_Small;
        }

    }
}
