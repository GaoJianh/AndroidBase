package com.zy.readerapplication.presenters;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import com.zy.readerapplication.R;
import com.zy.readerapplication.activity.ShowActivity;
import com.zy.readerapplication.customui.Titanic;
import com.zy.readerapplication.customui.TitanicTextView;
import com.zy.readerapplication.other.Typefaces;
import com.zy.readerapplication.webview.X5WebView;

/**
 * @author seven
 * @description
 * @date 2020/7/28.
 */
public class ShowActivityPresenter extends ActivityPresenter<ShowActivity> {
    private static final String TAG = ShowActivityPresenter.class.getSimpleName();
    private X5WebView webView;
    private TitanicTextView progressBar;
    private Titanic titanic = new Titanic();

    private ShowActivityPresenter(@NonNull ShowActivity activity) {
        this.activity = activity;
    }

    public static ShowActivityPresenter getInstance(@NonNull ShowActivity activity) {
        return new ShowActivityPresenter(activity);
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            activity.finish();
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_show;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (!isActivityNull()) {
            activity.setContentView(getLayoutId());
            initProgressBar();
            initWebView();
        }
    }

    private void initProgressBar() {
        progressBar = activity.findViewById(R.id.progress_bar);
        progressBar.setTypeface(Typefaces.get(activity, "Satisfy-Regular.ttf"));
        titanic.start(progressBar);
    }

    private void initWebView() {
        webView = activity.findViewById(R.id.show_page);
        setWebViewClient();
        setWebChromeClient();
        //webView.loadUrl("http://zysc.wxgxxc.cn/");
        webView.loadUrl("https://www.baidu.com/");
    }

    private void setWebViewClient() {
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                return super.shouldOverrideUrlLoading(webView, s);
            }

            @Override
            public void onPageStarted(WebView webView, String s, Bitmap bitmap) {
                super.onPageStarted(webView, s, bitmap);
            }

            @Override
            public void onPageFinished(WebView webView, String s) {
                super.onPageFinished(webView, s);
                if (progressBar != null) {
                    titanic.cancel();
                    progressBar.setVisibility(View.GONE);
                    //ReadActivity.startActivity(activity, new CollBookBean(), false);
                }
            }
        });
    }

    private void setWebChromeClient() {
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsConfirm(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsConfirm(webView, s, s1, jsResult);
            }

            @Override
            public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }

            @Override
            public void onHideCustomView() {
                super.onHideCustomView();
            }

            @Override
            public boolean onJsAlert(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsAlert(webView, s, s1, jsResult);
            }
        });
    }

}
