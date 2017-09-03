package com.cins.eric.mytoast;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Eric on 2017/9/2.
 */

public class JoinToast {

    private JoinToast() {

    }

    public static void showJoinToast(Context context) {
        showTost(context, R.mipmap.ic_launcher, R.string.join);
    }

    public static void showTost(Context context, @DrawableRes int iconId, @StringRes int textId) {
        final Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.bk_join_toast, null);
        TextView text = (TextView) view.findViewById(R.id.text);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(iconId);
        text.setText(textId);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        UI.HANDLER.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 200);
    }
}
