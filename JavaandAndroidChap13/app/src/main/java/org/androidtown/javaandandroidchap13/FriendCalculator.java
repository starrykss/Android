package org.androidtown.javaandandroidchap13;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by kss34 on 2017-05-09.
 */

public class FriendCalculator extends CalculatorAdapter {
    Context mContext;

    public FriendCalculator(Context context) {
        mContext = context;
    }

    public int add(int a, int b) {
        Toast.makeText(mContext, "더하기를 했습니다.", Toast.LENGTH_LONG).show();

        return a + b;
    }
    /*
    @Override
    public int subtract(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("빼기 구현 안함");
    }

    @Override
    public int multiply(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("더하기 구현 안함");
    }

    @Override
    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기 구현 안함");
    }
    */
}
