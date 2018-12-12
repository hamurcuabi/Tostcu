package com.emrehmrc.tostcu;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.widget.Toast;

public class TostcuUtil {

    public static final int SHORT = Toast.LENGTH_SHORT;
    public static final int LONG = Toast.LENGTH_LONG;
    public static Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
    @ColorInt
    public static int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");
    @ColorInt
    public static int ERROR_COLOR = Color.parseColor("#D50000");
    @ColorInt
    public static int INFO_COLOR = Color.parseColor("#3F51B5");
    @ColorInt
    public static int SUCCESS_COLOR = Color.parseColor("#388E3C");
    @ColorInt
    public static int WARNING_COLOR = Color.parseColor("#FFA900");
    public static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
    public static int textSize = 16; // in SP
    public static boolean with_anim=true;
    private static String TAG = "TostcuUtil";


}
