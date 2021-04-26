package com.company;

import java.util.Scanner;

public class useRadix {
    public static void main(String[] args) {
        Scanner sc=new Scanner("here i'm changing the radix of scanner");
        System.out.println("string"+sc.nextLine());
        sc.useRadix(32);
        System.out.println("radix is:"+sc.radix());
        sc.close();
    }

}
