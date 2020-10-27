package com.shopee.xiaoshuai.entrytask.util;

/**
 * 工具类，用于封装一对属性
 * @param <A>
 * @param <B>
 */

public class Tuple<A, B> {
    public final A first;

    public final B second;

    public Tuple(A a, B b){
        first = a;
        second = b;
    }

    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
