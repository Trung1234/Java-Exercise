package com.trungnt.car;

public class Car {
    int maxSpeed, minSpeed;

    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a);//Chuyen doi int thanh Integer
        Integer j=a;//Day la autoboxing, bay gio compiler se viet la Integer.valueOf(a)

        System.out.println(a+" "+i+" "+j);
    }
}
