package com.company;

import java.util.* ;

public class Conditional_with_elseif {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Valaue of a");
        int a= sc.nextInt();
        System.out.println("Enter Valaue of b");
        int b=sc.nextInt();
        if (a==b){
            System.out.println("A equals to b");
        }
        else if(a>b) {
            System.out.println("A is Greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
