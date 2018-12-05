package com.pattern;

/**
 * 适配器
 */
public class Adapter {
    private Current current;
    public Adapter(Current current){
        this.current = current;
    }

    /**
     * 使用适配器转成18v的电压
     */
    public void electroAdapter18(){
        this.current.electro();
        System.out.println("使用适配器，转成电压18v");
    }
}
