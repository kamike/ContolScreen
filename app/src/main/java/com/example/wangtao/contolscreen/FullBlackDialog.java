package com.example.wangtao.contolscreen;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by wangtao on 2017/11/3.
 */

public class FullBlackDialog extends Dialog {
    private final Context context;

    public FullBlackDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        this.context = context;
        Window window = getWindow();
        window.setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        setCancelable(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView iv = new ImageView(context);
        iv.setBackgroundColor(Color.BLACK);
        setContentView(iv);
    }
}
