package com.shanghai.ssm.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {

	
	public static void main(String[] args) {
		
		
		char[] a1={'a','e','i','o','u','A','E','I','O','U'};
		
		ArrayList a2 =new ArrayList<>(65535);
		
		
		int sum=0;
		int flg=0;
		String sc = new Scanner(System.in).nextLine();
		
		if (0< sc.length() & 65535 >= sc.length() ){
		
			 for(int j=0;j<sc.length();j++) {
			
					for(int i=0;i<a1.length;i++){
						if(sc.charAt(j) == a1[i]){
			
							sum=sum+1;
							flg=1;
						}
					}
					if(flg==0||j==sc.length()-1){
						a2.add(sum);
						sum=0;
					}
					
					flg=0;
				 }
			 System.out.println("×î³¤ÔªÒô×Ö·û×Ö´®£º"+Collections.max(a2));
		  }
		}
		
	}

