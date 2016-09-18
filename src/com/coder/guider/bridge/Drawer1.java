package com.coder.guider.bridge;

/**
 * Created by apple on 16/9/7.
 */
public class Drawer1 implements Drawing {
    PaintA a;

    public Drawer1() {
        a = new PaintA();

    }

    @Override
    public void drawRantanle() {
        a.drawRantanle();
    }

    @Override
    public void drawCircle() {
        a.drawCircle();
    }
}
