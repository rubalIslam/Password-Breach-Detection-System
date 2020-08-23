package com.honeywords.dto;

import java.util.Random;

public class Test {

	
	public static void main(String[] args) {
	
		
		/*	char ch[]={64,33,35,36,37,38,42,43,63,126};
			int maximum=100;
			int minimum=67;
			int n = maximum - minimum + 1;
			System.out.println("randomNum"+randomNum+j);
			System.out.printf("raj"+"%c\n",randomNum);          
	    */
		Random rn = new Random();
		char ch[]={'@','!','#','$','%','&','*','+','?','|'};
		
		int i1 = rn.nextInt(10);
		int i2 = rn.nextInt(10);
		int i3= rn.nextInt(10);
		int i4= rn.nextInt(10);
		int i5 = rn.nextInt(10);
		int j = rn.nextInt(999);
		char randomNum1 = ch[i1];
		char randomNum2 = ch[i2];
		char randomNum3 = ch[i3];
		char randomNum4 = ch[i4];
		char randomNum5 = ch[i5];
		
		String s1="randomNum"+randomNum1+j;
		String s2="randomNum"+randomNum2+j;
		String s3="randomNum"+randomNum3+j;
		String s4="randomNum"+randomNum4+j;
		String s5="randomNum"+randomNum5+j;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
          
         }
	
}
