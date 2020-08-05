package com.zy.readerapplication.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author seven
 * @description
 * @date 2020/8/1.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    protected HolderClickListener holderClickListener;

    public BaseViewHolder(@NonNull View itemView, @NonNull HolderClickListener listener) {
        super(itemView);
        this.holderClickListener = listener;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holderClickListener.onClick(getAdapterPosition());
            }
        });
    }

    public static interface HolderClickListener {
        void onClick(int position);//handle itemView's click
    }

    public void setHolderClickListener(HolderClickListener holderClickListener) {
        this.holderClickListener = holderClickListener;
    }
}
