package com.company;

public class gcd {
    public static void main(String[] args) {
        int n1=32;
        int n2=22;
        int i=1;
        int j;
        for(j=i;j<=n1 &&j<=n2;j++)
        {
            if(n1==0 && n2==0)
                i=j;
        }
        System.out.printf("gcd of %d and %d is %d",n1,n2,j);
    }
}
