package org.androidtown.javaandandroidchap13;

/**
 * Created by kss34 on 2017-05-09.
 */

public class MyCalculator extends CalculatorAdapter {
    public int add(int a, int b) {
        int result = a + b;
        addHistory(a, b, CalcData.TYPE_ADD, result);

        return result;
        // return a + b;
    }
    /*
    public int subtract(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("빼기 구현 안함");
    }

    public int multiply(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("더하기 구현 안함");
    }

    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기 구현 안함");
    }
    */
}
