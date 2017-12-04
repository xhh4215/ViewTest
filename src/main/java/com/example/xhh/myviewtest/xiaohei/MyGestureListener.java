package com.example.xhh.myviewtest.xiaohei;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.Toast;

import com.example.xhh.myviewtest.MainActivity;

/**
 * Created by xhh on 2017/12/4.
 * 手势处理
 */

public class MyGestureListener implements OnGestureListener {
    private Context context;

    public MyGestureListener(Context mContext) {
        context = mContext;
    }

    /**
     * 用户按下屏幕的时候触发的事件
     *
     * @param e 用户在界面的事件
     * @return
     */
    @Override
    public boolean onDown(MotionEvent e) {
        Log.i("MyGesture", "onDown");
        Toast.makeText(context, "宝贝按下类屏幕", Toast.LENGTH_SHORT).show();
        return false;
    }

    /**
     * 按下的事件超过瞬间触发的事件
     *
     * @param e
     */
    @Override
    public void onShowPress(MotionEvent e) {
        Log.i("MyGesture", "onShowPress");
        Toast.makeText(context, "你要多按一会哟", Toast.LENGTH_SHORT).show();
    }

    /***
     * 轻轻点击一下屏幕触发的事件
     * @param e
     * @return
     */
    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Toast.makeText(context, "哎呀你按了一下就抬起来了", Toast.LENGTH_SHORT).show();
        return false;
    }

    /***
     * 在屏幕滑动的时候触发的事件
     * @param e1
     * @param e2
     * @param distanceX  x轴滑动的距离
     * @param distanceY  y轴滑动的距离
     * @return
     */
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Toast.makeText(context, "你滑动了屏幕呀", Toast.LENGTH_SHORT).show();
        return false;
    }

    /***
     * 长按的时候触发的事件
     * @param e
     */
    @Override
    public void onLongPress(MotionEvent e) {
        Toast.makeText(context, "你长按了屏幕呀", Toast.LENGTH_SHORT).show();
    }

    /***
     * 滑动屏幕触发的事件
     * @param e1
     * @param e2
     * @param velocityX  x轴滑动的速度
     * @param velocityY  y轴滑动的速度
     * @return
     */
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Toast.makeText(context, "屏幕在滑动", Toast.LENGTH_SHORT).show();
        return false;
    }
}
