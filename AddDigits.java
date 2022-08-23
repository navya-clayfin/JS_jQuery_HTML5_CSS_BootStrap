package com.clayfin;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scn.nextInt();
        int sum = 0;
        int sum1 = 0;
        if(a>1 && a<1000) {
        while(a>0) {
            int ld =  a%10;
            sum = sum +ld;
            a = a/10;
        }
        System.out.println("The sum of the digits is: "+sum);
        while(sum>0) {
        	int ld1 = sum%10;
        	sum1 = sum1+ld1;
        	sum = sum/10;
        }
        System.out.println("The final sum of the digits is: "+sum1); 
	}
        
        
	}

}
