package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = sc.nextInt();
        if(a!=0){
            double x = -b/a;
            System.out.println("Phương trình có nghiệm là: " + x);
        }else{
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
