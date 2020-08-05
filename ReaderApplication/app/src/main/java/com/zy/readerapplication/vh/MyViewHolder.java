package com.zy.readerapplication.vh;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zy.readerapplication.R;
import com.zy.readerapplication.base.BaseViewHolder;

/**
 * @author seven
 * @description
 * @date 2020/8/1.
 */
public class MyViewHolder extends BaseViewHolder {
    public TextView textView;
    public MyViewHolder(@NonNull View itemView, @NonNull HolderClickListener listener) {
        super(itemView, listener);
        textView = itemView.findViewById(R.id.text);
    }
}
