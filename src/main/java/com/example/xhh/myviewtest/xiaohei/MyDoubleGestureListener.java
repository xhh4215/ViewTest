package com.example.xhh.myviewtest.xiaohei;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by xhh on 2017/12/4.
 * 双击屏幕触发的事件的接口的实现
 */

public class MyDoubleGestureListener implements GestureDetector.OnDoubleTapListener {
    private Context mContext;

    public MyDoubleGestureListener(Context context) {
        mContext = context;
    }

    /***
     * 判断是不是双击事件的方法
     * @param e
     * @return
     */
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Toast.makeText(mContext, "onSingleTapConfirmed", Toast.LENGTH_SHORT).show();
        return false;
    }

    /**
     * 双击事件触发的方法 ，内部实现双击的逻辑
     *
     * @param e
     * @return
     */
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Toast.makeText(mContext, "onDoubleTap", Toast.LENGTH_SHORT).show();

        return false;
    }

    /***
     * 双击事件的中间间隔发生的动作的监听的方法
     * @param e
     * @return
     */
    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Toast.makeText(mContext, "onDoubleTapEvent", Toast.LENGTH_SHORT).show();
        return false;
    }
}
