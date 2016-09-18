package com.coder.guider.bridge;


/**
 * Created by apple on 16/9/7.
 */
public class Rantangle extends Shape {
    public Rantangle(Drawing drawing) {
        super(drawing);
    }

    public Rantangle() {
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    public void test2() {
        super.test();
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getName());


        System.out.println(this.getClass() == super.getClass());
    }
}
