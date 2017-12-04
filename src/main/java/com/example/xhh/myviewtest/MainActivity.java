package com.example.xhh.myviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.xhh.myviewtest.xiaohei.MyDoubleGestureListener;
import com.example.xhh.myviewtest.xiaohei.MyGestureListener;
import com.example.xhh.myviewtest.xiaohei.MySimpleGestureListener;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private TextView mTextView;
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textViewId);
        mGestureDetector = new GestureDetector(new MyGestureListener(MainActivity.this));
        mGestureDetector.setOnDoubleTapListener(new MyDoubleGestureListener(MainActivity.this));
        mGestureDetector = new GestureDetector(new MySimpleGestureListener(MainActivity.this));
        mTextView.setOnTouchListener(this);
        mTextView.setFocusable(true);
        mTextView.setClickable(true);
        mTextView.setLongClickable(true);

    }

    /***
     * 将捕获到的事件 交给 event来处理
     * @param v   触发事件的view
     * @param event  触发的事件
     * @return 是否将事件向下传递
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return mGestureDetector.onTouchEvent(event);
    }
}
