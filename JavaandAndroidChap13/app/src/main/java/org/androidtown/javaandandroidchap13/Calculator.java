package org.androidtown.javaandandroidchap13;

import java.util.ArrayList;

/**
 * Created by kss34 on 2017-05-09.
 */

public interface Calculator {

    public void clearHistory();

    public ArrayList<CalcData> getHistory();


    public int add(int a, int b);

    public int subtract(int a, int b) throws UnImplementedException;

    public int multiply(int a, int b) throws UnImplementedException;

    public int divide(int a, int b) throws UnImplementedException;
}
