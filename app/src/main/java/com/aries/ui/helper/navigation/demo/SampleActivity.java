package com.aries.ui.helper.navigation.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aries.ui.helper.navigation.NavigationBarUtil;
import com.aries.ui.helper.navigation.NavigationViewHelper;
import com.aries.ui.util.RomUtil;
import com.aries.ui.view.title.TitleBarView;

/**
 * Created: AriesHoo on 2018/2/2/002 12:37
 * E-Mail: AriesHoo@126.com
 * Function:
 * Description:
 */
public class SampleActivity extends BaseActivity {

    private boolean mControlEnable;
    private boolean mTransEnable;
    private boolean mPlusNavigationViewEnable;

    public static void start(Activity activity, boolean controlEnable, boolean transEnable, boolean plusNavigationViewEnable) {
        Intent intent = new Intent(activity, SampleActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle bundle = new Bundle();
        bundle.putBoolean("controlEnable", controlEnable);
        bundle.putBoolean("transEnable", transEnable);
        bundle.putBoolean("plusNavigationViewEnable", plusNavigationViewEnable);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mControlEnable = getIntent().getBooleanExtra("controlEnable", mControlEnable);
        mTransEnable = getIntent().getBooleanExtra("transEnable", mTransEnable);
        mPlusNavigationViewEnable = getIntent().getBooleanExtra("plusNavigationViewEnable", mPlusNavigationViewEnable);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentLayout() {
        return R.layout.activity_sample;
    }

    @Override
    protected void beforeControlNavigation(NavigationViewHelper navigationHelper) {
        super.beforeControlNavigation(navigationHelper);
        navigationHelper.setControlEnable(mControlEnable)
                .setTransEnable(mTransEnable)
                .setPlusNavigationViewEnable(mPlusNavigationViewEnable)
                .setBottomView(findViewById(R.id.lLayout_main));
    }

    @Override
    protected void setTitleBar(TitleBarView titleBar) {
        titleBar.setTitleMainText("Sample")
                .setTitleSubText(getSubText())
                .setBackgroundColor(Color.argb(50,0,0,0));
    }


    private String getSubText() {
        String text = "Android" + Build.VERSION.RELEASE;
        if (RomUtil.isMIUI()) {
            text += "-MIUI" + RomUtil.getMIUIVersion();
        } else if (RomUtil.isFlyme()) {
            text += "-Flyme" + RomUtil.getFlymeVersionCode();
        } else if (RomUtil.isEMUI()) {
            text += "-EMUI" + RomUtil.getEMUIVersion();
        }
        text += (NavigationBarUtil.hasSoftKeys(getWindowManager()) ? "" : "没") + "有虚拟导航栏";
        return text;
    }
}
