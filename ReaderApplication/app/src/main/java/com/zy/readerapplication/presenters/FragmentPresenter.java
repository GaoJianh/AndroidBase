package com.zy.readerapplication.presenters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author seven
 * @description
 * @date 2020/7/27.
 */
public abstract class FragmentPresenter implements Presenter {
    public abstract View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    public abstract void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState);

    public abstract void onAttach(@NonNull Context context);

    public abstract void onDestroyView();

    public abstract void onDetach();
}
