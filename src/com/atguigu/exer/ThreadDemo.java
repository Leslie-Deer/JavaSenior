package com.atguigu.exer;

/**
 * 多线程的创建，方式一：继承于THread类
 * 1.创建一个继承Thread类的子类
 * 2.创建Thread类的run()-->将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 *
 * 创建两个分线程，其中一个线程遍历100以内的偶数，另一个遍历100以内的奇数
 *
 *
 * @author 顾鹿凯
 * @create 2021-05- 22- 12:08 下午
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 m1=new MyThread1();
//        MyThread2 m2=new MyThread2();
//
//        m1.start();
//        m2.start();
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();


    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}