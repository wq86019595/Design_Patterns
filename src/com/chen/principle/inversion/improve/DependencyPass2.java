package com.chen.principle.inversion.improve;

/**
 * 依赖关系传递的三种方式
 * 2.通过构造器进行依赖传递
 */

public class DependencyPass2 {

    public static void main(String[] args) {

        ChangHong2 changHong2=new ChangHong2();
		OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong2);
		openAndClose2.open2();
    }
}

class ChangHong2 implements ITV2 {

    public void play2() {
        // TODO Auto-generated method stub
        System.out.println("打开长虹电视机_DependencyPass2");
    }

}
// 方式2: 通过构造方法依赖传递
 interface IOpenAndClose2 {
    public void open2(); //抽象方法
 }
 interface ITV2 { //ITV接口
    public void play2();
 }
 class OpenAndClose2 implements IOpenAndClose2{
     public ITV2 tv2; //成员
     public OpenAndClose2(ITV2 tv2){ //构造器
     this.tv2 = tv2;
     }
     public void open2(){
     this.tv2.play2();
     }
 }