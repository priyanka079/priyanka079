package com.company;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System .in);
        System.out.print("enter name");
        String name= sc.nextLine();
        System.out.println("name is :"+name);
        sc.close();

    }
}
