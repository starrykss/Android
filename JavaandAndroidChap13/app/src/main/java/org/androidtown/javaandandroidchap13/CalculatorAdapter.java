package org.androidtown.javaandandroidchap13;

import java.util.ArrayList;

/**
 * Created by kss34 on 2017-05-09.
 */

public abstract class CalculatorAdapter implements Calculator {

    private ArrayList<CalcData> history = new ArrayList<CalcData>();

    public void addHistory(int a, int b, int type, int result) {
        CalcData data = new CalcData(a, b, type, result);
        history.add(data);
    }

    public void clearHistory() {
     history.clear();
    }

    public ArrayList<CalcData> getHistory() {
        return history;
    }

    @Override
    public abstract int add(int a, int b);

    @Override
    public int subtract(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("빼기 구현 안함");
    }

    @Override
    public int multiply(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("곱하기 구현 안함");
    }

    @Override
    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기 구현 안함");
    }
}
