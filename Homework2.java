package com.company;
import java.util.*;
public class Homework2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of a ");
        int a=sc.nextInt();
        System.out.println("Enter Value of b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Addition "+sum);
        int Sub=a-b;
        System.out.println("Substration "+ Sub);
        int mul=a*b;
        System.out.println("Multiplication "+mul);
        float div=a/b;
        System.out.println("Division "+ div);
        int  mod=a%b;
        System.out.println("Modulo "+mod);


    }
}
