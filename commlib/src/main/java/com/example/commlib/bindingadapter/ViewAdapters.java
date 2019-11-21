package com.example.commlib.bindingadapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

/**
 * @Description: ViewAdapter类作用描述
 * @Author: yzh
 * @CreateDate: 2019/11/15 14:37
 */
public class ViewAdapters {

    /**
     * requireAll 是意思是是否需要绑定全部参数, false为否
     */
    @BindingAdapter(value = {"textIsNullGone"}, requireAll = false)
    public static void setTexts(TextView view, String string) {
        //如果是空的话就设置为Gone
        if (TextUtils.isEmpty(string)) {
            if (view.getVisibility() != View.GONE) {
                view.setVisibility(View.GONE);
            }

        } else {
            if (view.getVisibility() != View.VISIBLE) {
                view.setVisibility(View.VISIBLE);
            }
            view.setText(string);
        }
    }

}
