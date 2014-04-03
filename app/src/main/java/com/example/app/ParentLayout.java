package com.example.app;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by hook on 14-1-22.
 */
public class ParentLayout extends LinearLayout {

    private static final String TAG = ParentLayout.class.getSimpleName();

    public ParentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_DOWN");
                break;
                //Log.d(TAG, "[dispatchTouchEvent] -> ACTION_DOWN, return true");
                //return true;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_UP");
                break;
                //Log.d(TAG, "[dispatchTouchEvent] -> ACTION_UP, return true");
                //return true;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_CANCEL");
                break;
            default:
                break;
        }
        boolean superReturn = super.dispatchTouchEvent(event);
        Log.i(TAG, "[dispatchTouchEvent] return super. = " + superReturn);
        return superReturn;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_DOWN");
                //break;
                Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_DOWN, return true");
                return true;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_MOVE");
                break;
                //Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_MOVE, return true");
                //return true;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "[onInterceptTouchEvent] -> ACTION_CANCEL");
                break;
            default:
                break;
        }
        boolean superReturn = super.onInterceptTouchEvent(event);
        Log.i(TAG, "[onInterceptTouchEvent] return super. = " + superReturn);
        return superReturn;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "[onTouchEvent] -> ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "[onTouchEvent] -> ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "[onTouchEvent] -> ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "[onTouchEvent] -> ACTION_CANCEL");
                break;
            default:
                break;
        }
        boolean superReturn = super.onTouchEvent(event);
        Log.i(TAG, "[onTouchEvent] return super. = " + superReturn);
        return superReturn;
    }
}
