package com.zy.readerapplication.activity;

import com.zy.readerapplication.base.BaseActivity;
import com.zy.readerapplication.presenters.ShowActivityPresenter;

/**
 * @author seven
 * @description
 * @date 2020/7/28.
 */
public class ShowActivity extends BaseActivity<ShowActivityPresenter> {
    @Override
    protected void bindPresenter() {
        if (isPresenterEmpty()) {
            setPresenter(ShowActivityPresenter.getInstance(this));
        }
    }
}
