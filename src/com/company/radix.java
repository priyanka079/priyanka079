package com.company;

import java.util.Scanner;

public class radix {
    public static void main(String[] args) {
        System.out.print("enter name");
        Scanner sc=new Scanner(System.in);
        sc.next();
        System.out.println("radix is:"+sc.radix());
        sc.close();
    }
}
