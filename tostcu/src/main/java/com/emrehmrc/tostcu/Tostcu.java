package com.emrehmrc.tostcu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.emrehmrc.tostcu.TostcuUtil.LOADED_TOAST_TYPEFACE;

public class Tostcu {
    private static final String TAG = "Tostcu";

    //succes methodes
    public static void succes(@NonNull Context context, @NonNull CharSequence message) {
        normal(context, message, R.drawable.ic_succes, Toast.LENGTH_SHORT, TostcuUtil.SUCCESS_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @StringRes int message) {
        normal(context, context.getString(message), R.drawable.ic_succes, Toast.LENGTH_SHORT,
                TostcuUtil
                        .SUCCESS_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @NonNull CharSequence message, boolean with_anim) {
        normal(context, message, R.drawable.ic_succes, Toast.LENGTH_SHORT, TostcuUtil.SUCCESS_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @StringRes int message, boolean with_anim) {
        normal(context, context.getString(message), R.drawable.ic_succes, Toast.LENGTH_SHORT, TostcuUtil
                        .SUCCESS_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @NonNull CharSequence message, int delay_ms) {
        normal(context, message, R.drawable.ic_succes, delay_ms, TostcuUtil.SUCCESS_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @StringRes int message, int delay_ms) {
        normal(context, context.getString(message), R.drawable.ic_succes, delay_ms, TostcuUtil
                        .SUCCESS_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @NonNull CharSequence message, int delay_ms, int location) {
        normal(context, message, R.drawable.ic_succes, delay_ms, TostcuUtil.SUCCESS_COLOR,
                location, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void succes(@NonNull Context context, @StringRes int message, int delay_ms, int
            location) {
        normal(context, context.getString(message), R.drawable.ic_succes, delay_ms, TostcuUtil
                        .SUCCESS_COLOR,
                location, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    //error methodes
    public static void error(@NonNull Context context, @NonNull CharSequence message) {
        normal(context, message, R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil.ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @StringRes int message) {
        normal(context, context.getString(message), R.drawable.ic_error, Toast.LENGTH_SHORT,
                TostcuUtil
                        .ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @NonNull CharSequence message, boolean with_anim) {
        normal(context, message, R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil.ERROR_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @StringRes int message, boolean with_anim) {
        normal(context, context.getString(message), R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil
                        .ERROR_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @NonNull CharSequence message, int delay_ms) {
        normal(context, message, R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil.ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @StringRes int message, int delay_ms) {
        normal(context, context.getString(message), R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil
                        .ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @NonNull CharSequence message, int delay_ms, int location) {
        normal(context, message, R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil.ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void error(@NonNull Context context, @StringRes int message, int delay_ms, int
            location) {
        normal(context, context.getString(message), R.drawable.ic_error, Toast.LENGTH_SHORT, TostcuUtil
                        .ERROR_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    //warning methodes
    public static void warning(@NonNull Context context, @NonNull CharSequence message) {
        normal(context, message, R.drawable.ic_warning, Toast.LENGTH_SHORT, TostcuUtil.WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @StringRes int message) {
        normal(context, context.getString(message), R.drawable.ic_warning, Toast.LENGTH_SHORT,
                TostcuUtil.WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @NonNull CharSequence message, boolean with_anim) {
        normal(context, message, R.drawable.ic_warning, Toast.LENGTH_SHORT, TostcuUtil.WARNING_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @StringRes int message, boolean
            with_anim) {
        normal(context, context.getString(message), R.drawable.ic_warning, Toast.LENGTH_SHORT,
                TostcuUtil
                        .WARNING_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @NonNull CharSequence message, int delay_ms) {
        normal(context, message, R.drawable.ic_warning, Toast.LENGTH_SHORT, TostcuUtil.WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @StringRes int message, int delay_ms) {
        normal(context, context.getString(message), R.drawable.ic_warning, Toast.LENGTH_SHORT,
                TostcuUtil
                        .WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @NonNull CharSequence message, int delay_ms, int location) {
        normal(context, message, R.drawable.ic_warning, Toast.LENGTH_SHORT, TostcuUtil.WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void warning(@NonNull Context context, @StringRes int message, int delay_ms, int
            location) {
        normal(context, context.getString(message), R.drawable.ic_warning, Toast.LENGTH_SHORT,
                TostcuUtil
                        .WARNING_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    //info methodes
    public static void info(@NonNull Context context, @NonNull CharSequence message) {
        normal(context, message, R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil.INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @StringRes int message) {
        normal(context, context.getString(message), R.drawable.ic_info, Toast.LENGTH_SHORT,
                TostcuUtil
                        .INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @NonNull CharSequence message, boolean with_anim) {
        normal(context, message, R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil.INFO_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @StringRes int message, boolean with_anim) {
        normal(context, context.getString(message), R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil
                        .INFO_COLOR,
                Gravity.CENTER, with_anim, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @NonNull CharSequence message, int delay_ms) {
        normal(context, message, R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil.INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @StringRes int message, int delay_ms) {
        normal(context, context.getString(message), R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil
                        .INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @NonNull CharSequence message, int
            delay_ms, int location) {
        normal(context, message, R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil.INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void info(@NonNull Context context, @StringRes int message, int
            delay_ms, int location) {
        normal(context, context.getString(message), R.drawable.ic_info, Toast.LENGTH_SHORT, TostcuUtil
                        .INFO_COLOR,
                Gravity.CENTER, true, TostcuUtil.currentTypeface, TostcuUtil.textSize);

    }

    public static void custom(@NonNull Context context,
                              @NonNull CharSequence message,
                              @DrawableRes int res_id,
                              int delay_ms,
                              @ColorInt int bg_color,
                              int gravity,
                              boolean with_anim,
                              Typeface typeface,
                              int text_size) {
        normal(context, message, res_id, delay_ms, bg_color, gravity, with_anim, typeface, text_size);

    }
    public static void custom(@NonNull Context context,
                              @StringRes int message,
                              @DrawableRes int res_id,
                              int delay_ms,
                              @ColorInt int bg_color,
                              int gravity,
                              boolean with_anim,
                              Typeface typeface,
                              int text_size) {
        normal(context, context.getString(message), res_id, delay_ms, bg_color, gravity, with_anim,
                typeface,
                text_size);

    }
    /**
     * @param context
     * @param message
     * @param res_id
     * @param delay_ms
     * @param status
     * @param gravity
     * @param with_anim
     */
    public static void normal(@NonNull Context context,
                              @NonNull CharSequence message,
                              @DrawableRes int res_id,
                              int delay_ms,
                              @ColorInt int status,
                              int gravity,
                              boolean with_anim,
                              Typeface typeface,
                              int text_size) {

        final Toast currentToast = Toast.makeText(context, "", delay_ms);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.tostcu_layout, null);
        final ImageView tostcu_icon = toastLayout.findViewById(R.id.toastcu_icon);
        final TextView tostcu_text = toastLayout.findViewById(R.id.toastcu_text);
        tostcu_icon.setImageResource(res_id);
        Drawable drawable = context.getResources().getDrawable(R.drawable.tostcu_bg_drawable);
        drawable.setColorFilter(status, PorterDuff.Mode.SRC_IN);
        toastLayout.setBackground(drawable);
        tostcu_text.setText(message);
        tostcu_text.setTextColor(TostcuUtil.DEFAULT_TEXT_COLOR);
        tostcu_text.setTypeface(typeface);
        tostcu_text.setTextSize(TypedValue.COMPLEX_UNIT_SP, text_size);
        currentToast.setGravity(gravity, 0, 0);
        currentToast.setView(toastLayout);
        if (with_anim) {
            Animation animation;
            animation = AnimationUtils.loadAnimation(context, R.anim.sample);
            currentToast.show();
            tostcu_icon.startAnimation(animation);
        } else currentToast.show();


    }

    public static class Config {
        @ColorInt
        private int DEFAULT_TEXT_COLOR = TostcuUtil.DEFAULT_TEXT_COLOR;
        @ColorInt
        private int ERROR_COLOR = TostcuUtil.ERROR_COLOR;
        @ColorInt
        private int INFO_COLOR = TostcuUtil.INFO_COLOR;
        @ColorInt
        private int SUCCESS_COLOR = TostcuUtil.SUCCESS_COLOR;
        @ColorInt
        private int WARNING_COLOR = TostcuUtil.WARNING_COLOR;

        private Typeface typeface = TostcuUtil.currentTypeface;
        private int textSize = TostcuUtil.textSize;
        private boolean with_anim = TostcuUtil.with_anim;

        private Config() {
            // avoiding instantiation
        }

        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            TostcuUtil.DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");
            TostcuUtil.ERROR_COLOR = Color.parseColor("#D50000");
            TostcuUtil.INFO_COLOR = Color.parseColor("#3F51B5");
            TostcuUtil.SUCCESS_COLOR = Color.parseColor("#388E3C");
            TostcuUtil.WARNING_COLOR = Color.parseColor("#FFA900");
            TostcuUtil.currentTypeface = LOADED_TOAST_TYPEFACE;
            TostcuUtil.textSize = 16;
            TostcuUtil.with_anim = true;

        }

        public Config setTextColor(@ColorInt int textColor) {
            DEFAULT_TEXT_COLOR = textColor;
            return this;
        }

        public Config setWithAnim(boolean with_anim) {
            this.with_anim = with_anim;
            return this;
        }

        public Config setErrorColor(@ColorInt int errorColor) {
            ERROR_COLOR = errorColor;
            return this;
        }

        public Config setInfoColor(@ColorInt int infoColor) {
            INFO_COLOR = infoColor;
            return this;
        }

        public Config setSuccessColor(@ColorInt int successColor) {
            SUCCESS_COLOR = successColor;
            return this;
        }

        public Config setWarningColor(@ColorInt int warningColor) {
            WARNING_COLOR = warningColor;
            return this;
        }

        public Config setToastTypeface(@NonNull Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        public Config setTextSize(int sizeInSp) {
            this.textSize = sizeInSp;
            return this;
        }


        public void apply() {
            TostcuUtil.DEFAULT_TEXT_COLOR = DEFAULT_TEXT_COLOR;
            TostcuUtil.ERROR_COLOR = ERROR_COLOR;
            TostcuUtil.INFO_COLOR = INFO_COLOR;
            TostcuUtil.SUCCESS_COLOR = SUCCESS_COLOR;
            TostcuUtil.WARNING_COLOR = WARNING_COLOR;
            TostcuUtil.currentTypeface = typeface;
            TostcuUtil.textSize = textSize;
        }
    }
}
