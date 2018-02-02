package com.aries.ui.helper.navigation.demo;

import android.view.View;
import android.widget.Button;

import com.aries.ui.view.title.TitleBarView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created: AriesHoo on 2018/2/2/002 11:40
 * E-Mail: AriesHoo@126.com
 * Function:
 * Description:
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.btn0) Button mBtn0;
    @BindView(R.id.btn1) Button mBtn1;
    @BindView(R.id.btn2) Button mBtn2;
    @BindView(R.id.btn3) Button mBtn3;
    @BindView(R.id.btn4) Button mBtn4;

    @Override
    protected int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void setTitleBar(TitleBarView titleBar) {
        titleBar.setLeftTextDrawable(null);
    }

    @OnClick({R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                SampleActivity.start(mContext, false, false, false);
                break;
            case R.id.btn1:
                SampleActivity.start(mContext, true, false, false);
                break;
            case R.id.btn2:
                SampleActivity.start(mContext, true, true, false);
                break;
            case R.id.btn3:
                SampleActivity.start(mContext, true, false, true);
                break;
            case R.id.btn4:
                SampleActivity.start(mContext, true, true, true);
                break;
        }
    }

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TitleBarView titleBarView = (TitleBarView) findViewById(R.id.titleBar);
//        titleBarView.setStatusBarLightMode(true);
//        NavigationViewHelper.with(this)
//                .setControlEnable(true)
//                .setTransEnable(false)
//                .setPlusNavigationViewEnable(true)
//                .setControlBottomEditTextEnable(true)
//                .setBottomView(findViewById(R.id.lLayout_main))
//                .init();
//    }
}
