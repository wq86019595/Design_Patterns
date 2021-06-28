package com.chen.principle.inversion.improve;

/**
 * 依赖关系传递的三种方式
 * 1.通过接口传递实现依赖
 */

public class DependencyPass1 {

    public static void main(String[] args) {
        ChangHong1 changHong1=new ChangHong1();
        OpenAndClose1 openAndClose1 =new OpenAndClose1();
        openAndClose1.open1(changHong1);
    }

    // 方式1： 通过接口传递实现依赖
    //开关的接口
    interface IOpenAndClose1 {
        public void open1(ITV1 tv); //抽象方法,接收接口
    }

    interface ITV1 { //ITV接口
        public void play1();
    }

    static class ChangHong1 implements ITV1 {
        public void play1() {
            System.out.println("打开长虹电视机_DependencyPass1");
        }
    }
    // 实现接口
    static class OpenAndClose1 implements IOpenAndClose1 {
        public void open1(ITV1 tv){
            tv.play1();
        }


    }
}
