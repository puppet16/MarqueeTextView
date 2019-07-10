package com.luck.myapplication;

import android.widget.TextView;

import com.luck.library.base.BaseActivity;

import butterknife.BindString;
import butterknife.BindView;

public class MarqueeActivity extends BaseActivity {

    @BindView(R.id.tv_2)
    TextView mTv2;
    @BindView(R.id.tv_3)
    TextView mTv3;
    @BindView(R.id.tv_4)
    TextView mTv4;
    @BindView(R.id.tv_5)
    TextView mTv5;

    @BindString(R.string.marquee_tv2)
    String mString2;
    @BindString(R.string.marquee_tv3)
    String mString3;
    @BindString(R.string.marquee_tv4)
    String mString4;
    @BindString(R.string.marquee_tv5)
    String mString5;

    @Override
    protected void initPage() {
        mTv2.setText(mString2);
        mTv3.setText(mString3);
        mTv4.setText(mString4);
        mTv5.setText(mString5);
    }

    @Override
    protected int getPageLayoutId() {
        return R.layout.activity_marquee;
    }
}
