package com.pattern;

public class Main {
    public static void main(String[] args) {
        Current current = new Current();//当前电压

        //使用适配器转成18v电压
        Adapter adapter = new Adapter(current);
        adapter.electroAdapter18();
    }
}
