package com.example.xhh.myviewtest.xiaohei;

import android.view.ScaleGestureDetector;

/**
 * Created by xhh on 2017/12/4.
 * 用于处理缩放的工具类，用法与GestureDetector类似，都是通过onTouchEvent()关联相应的MotionEvent的。使用该类时，
 * 用户需要传入一个完整的连续不断地motion事件（包含ACTION_DOWN,ACTION_MOVE和ACTION_UP事件）。
 */

public class MyScaleGestureDetector implements ScaleGestureDetector.OnScaleGestureListener {
    /**
     * 缩放的时候回调的方法
     * 缩放时。返回值代表本次缩放事件是否已被处理。如果已被处理，那么detector就会重置缩放事件；如果未被处理，detector会继续进行计算
     * ，修改getScaleFactor()的返回值，直到被处理为止。因此，它常用在判断只有缩放值达到一定数值时才进行缩放。例如：
     *
     * @param detector 处理缩放的是对象
     * @return
     */
    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        return false;
    }

    /**
     * 缩放开始的时候回调的方法
     * 缩放开始。该detector是否处理后继的缩放事件。返回false时，不会执行onScale()。
     *
     * @param detector 处理缩放的是对象
     * @return false onScale（）不会执行 true onScale（）会执行
     */
    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        return false;
    }

    /**
     * 回调结束的时候调用的方法
     *
     * @param detector
     */
    @Override
    public void onScaleEnd(ScaleGestureDetector detector) {

    }
    /**
     *   1 onTouchEvent()：关联MotionEvent。返回true代表该detector想继续接收后继的motion事件；否则反之。默认时该方法返回true。
     *
     *   2 getScaleFactor()：获取本次缩放事件的缩放因子(缩放事件以onScale()返回值为基准，一旦该方法返回true，代表本次事件结束，
     *     要开启下次事件)。它的返回值是指本次事件中的缩放值，并不是相对于最开始的值。如一张图片开始放大2倍，后来又放大1.1倍。那么
     *     第二次放大时，该方法返回的就是1.1，而不是总放大倍数：2*1.1
     *     。
     *   3 getCurrentSpan()： 返回手势过程中，组成该手势的两个触点的当前距离。返回值以像素为单位的触点距离。
     *
     *   4 getCurrentSpanX(),getCurrentSpanY()：跟getCurrentSpan()类似，只不过一个是返回的是x轴上的距离，一个是y轴上的距离。注意：返回值有可能为负数。这两个方法的返回值和getCurrentSpan()的返回值满足勾股定理。

     *   5 getFocusY(),getFocusX()：返回组成该手势的两个触点的中点在组件上的y,x轴坐标，单位为像素。
     *
     *   6getPreviousSpan()：返回缩放过程中，组成当前缩放手势的两个触点的前一次距离。假设有a,b,c三个手指，某一次a,b组成缩放手势，两者的距离是300；随后一直是b,c组成缩放手势，当c抬起时，b,c的距离时100。此时，ab会组成缩放手势，该值返回的就是300，而不是b,c的100。

     *   7getPreviousSpanX(),getPreviousSpanY()：同getPreviousSpan()类似。
     *
     *   8getEventTime()：获取当前motion事件的时间。源码如下：
     */
}
