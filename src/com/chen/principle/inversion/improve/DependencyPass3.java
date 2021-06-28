package com.chen.principle.inversion.improve;

/**
 * 方式3.通过setter方法进行依赖传递
 */
public class DependencyPass3 {
    public static void main(String[] args) {
        ChangHong3 changHong3 = new ChangHong3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv3(changHong3);
        openAndClose3.open3();
    }
}

interface ITV3{
    void play3();
}

class ChangHong3 implements ITV3{

    public void play3() {
        System.out.println("打开长虹电视机_DependencyPass3");
    }
}
interface IOpenAndClose3 {
    public void open3(); // 抽象方法

    public void setTv3(ITV3 tv3);
}
class OpenAndClose3 implements IOpenAndClose3 {
    private ITV3 tv3;

    public void setTv3(ITV3 tv3) {
        this.tv3 = tv3;
    }

    public void open3() {
        this.tv3.play3();
    }
}
