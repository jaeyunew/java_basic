package day05.forEx;

import java.util.Scanner;

public class StarEx08 {public static void main(String[] args){
    int n;
    int sel;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sel = sc.nextInt();
    if(n>100 || n<1)
    {
        System.out.println("INPUT ERROR!");
        return;
    }
    if(sel == 1)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    else if(sel==2){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    else if(sel == 3){
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    else
    {
        System.out.println("INPUT ERROR!");
        return;
    }
}
}
