package com.example.xhh.myviewtest.xiaohei;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;
/**
 * Created by xhh on 2017/12/4.
 */

public class MySimpleGestureListener extends GestureDetector.SimpleOnGestureListener {
    private Context context;
    final int FLING_MIN_DISTANCE = 100, FLING_MIN_VELOCITY = 200;

    public MySimpleGestureListener(Context mContext) {
        context = mContext;

    }

    /*****OnGestureListener的函数*****/
    public boolean onDown(MotionEvent e) {
        Log.i("MyGesture", "onDown");
        Toast.makeText(context, "onDown", Toast.LENGTH_SHORT)
                .show();
        return false;
    }

    public void onShowPress(MotionEvent e) {
        Log.i("MyGesture", "onShowPress");
        Toast.makeText(context, "onShowPress", Toast.LENGTH_SHORT)
                .show();
    }

    public boolean onSingleTapUp(MotionEvent e) {
        Log.i("MyGesture", "onSingleTapUp");
        Toast.makeText(context, "onSingleTapUp",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                            float distanceX, float distanceY) {
        Log.i("MyGesture", "onScroll:" + (e2.getX() - e1.getX()) + "   "
                + distanceX);
        Toast.makeText(context, "onScroll", Toast.LENGTH_LONG)
                .show();

        return true;
    }

    public void onLongPress(MotionEvent e) {
        Log.i("MyGesture", "onLongPress");
        Toast.makeText(context, "onLongPress", Toast.LENGTH_LONG)
                .show();
    }

    /**
     * 触发条件 ：
     * X轴的坐标位移大于FLING_MIN_DISTANCE，且移动速度大于FLING_MIN_VELOCITY个像素/秒
     * 参数解释：
     * e1：第1个ACTION_DOWN MotionEvent
     * e2：最后一个ACTION_MOVE MotionEvent
     * velocityX：X轴上的移动速度，像素/秒
     * velocityY：Y轴上的移动速度，像素/秒
     */
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        Log.i("MyGesture", "onFling");
        Toast.makeText(context, "onFling", Toast.LENGTH_LONG)
                .show();
        if (e1.getX() - e2.getX() > FLING_MIN_DISTANCE && Math.abs(velocityX) > FLING_MIN_VELOCITY){
            // Fling left
            Log.i("MyGesture", "Fling left");
            Toast.makeText(context, "Fling Left", Toast.LENGTH_SHORT).show();
        }  else if (e2.getX() - e1.getX() > FLING_MIN_DISTANCE
                    && Math.abs(velocityX) > FLING_MIN_VELOCITY) {
        // Fling right
        Log.i("MyGesture", "Fling right");
        Toast.makeText(context, "Fling Right", Toast.LENGTH_SHORT).show();
    }
            return true;
    }

    /*****OnDoubleTapListener的函数*****/
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.i("MyGesture", "onSingleTapConfirmed");
        Toast.makeText(context, "onSingleTapConfirmed",
                Toast.LENGTH_LONG).show();
        return true;
    }

    public boolean onDoubleTap(MotionEvent e) {
        Log.i("MyGesture", "onDoubleTap");
        Toast.makeText(context, "onDoubleTap", Toast.LENGTH_LONG)
                .show();
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.i("MyGesture", "onDoubleTapEvent");
        Toast.makeText(context, "onDoubleTapEvent",
                Toast.LENGTH_LONG).show();
        return true;
    }

}
