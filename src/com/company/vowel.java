package com.company;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);// to get characters from  0 positions one by one, input from users
        System.out.println("enter alphabet:");
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' )
        {
            System.out.println("The given letter is vowel");
        }
        else

            System.out.println("The given letter is Consonant");

    }


}


