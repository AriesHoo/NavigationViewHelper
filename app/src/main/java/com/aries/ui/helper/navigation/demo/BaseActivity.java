package com.aries.ui.helper.navigation.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aries.ui.helper.navigation.NavigationViewHelper;
import com.aries.ui.view.title.TitleBarView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created: AriesHoo on 2018/2/2/002 10:57
 * E-Mail: AriesHoo@126.com
 * Function:
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Activity mContext;
    protected View mContentView;
    protected Unbinder mUnBinder;

    protected TitleBarView mTitleBar;
    protected NavigationViewHelper mNavigationViewHelper;

    protected abstract int getContentLayout();

    protected abstract void setTitleBar(TitleBarView titleBar);

    /**
     * 设置init之前用于调整属性
     *
     * @param navigationHelper
     */
    protected void beforeControlNavigation(NavigationViewHelper navigationHelper) {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mContentView = View.inflate(mContext, getContentLayout(), null);
        setContentView(mContentView);
        mUnBinder = ButterKnife.bind(this);
        mContentView.setBackgroundResource(R.color.colorBackground);
        mTitleBar = (TitleBarView) findViewById(R.id.titleBar);
        if (mTitleBar != null) {
            mTitleBar.setStatusBarLightMode(true)
                    .setOnLeftTextClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            onBackPressed();
                        }
                    });
            setTitleBar(mTitleBar);
        }
        setControlNavigation();
    }

    /**
     * 设置NavigationView控制
     */
    private void setControlNavigation() {
        mNavigationViewHelper = NavigationViewHelper.with(this)
                .setLogEnable(BuildConfig.DEBUG)
                .setControlEnable(true)
                .setTransEnable(false)
                .setPlusNavigationViewEnable(false)
                .setBottomView(mContentView)
                .setControlBottomEditTextEnable(true)
                .setNavigationViewColor(Color.argb(102, 0, 0, 0))
                .setNavigationLayoutDrawable(mContentView.getBackground());
        beforeControlNavigation(mNavigationViewHelper);
        mNavigationViewHelper.init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
    }
}
