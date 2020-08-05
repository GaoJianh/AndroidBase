package com.zy.readerapplication.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * @author seven
 * @description T is a bean model, VH is a view holder
 * @date 2020/8/1.
 */
public abstract class BaseAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {
    protected List<T> dataList;
    protected abstract int getItemLayoutId(int viewType);
    protected abstract VH createViewHolder(View view, BaseViewHolder.HolderClickListener holderClickListener);
    protected abstract BaseViewHolder.HolderClickListener bindItemClickListener();

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getItemLayoutId(viewType), parent, false);

        return createViewHolder(view, bindItemClickListener());
    }


    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    protected boolean isDataListNull() {
        return dataList == null;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
        notifyDataSetChanged();
    }
}
