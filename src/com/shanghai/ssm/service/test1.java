package com.shanghai.ssm.service;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		
		int[] str ={0,1,2,3,4,5,6};
		int t;
		String sc = new Scanner(System.in).nextLine();
		
		for(int i=0;i<sc.length();i++){
			System.out.println(sc.charAt(i));
			if(sc.charAt(i)=='L'){
				t=str[1];
				str[1]=str[5];
				str[5]=str[2];
				str[2]=str[6];
				str[6]=t;
				
			}
			if(sc.charAt(i)=='R'){
				t=str[1];
				str[1]=str[6];
				str[6]=str[2];
				str[2]=str[5];
				str[5]=t;
			}
			if(sc.charAt(i)=='F'){
				t=str[3];
				str[3]=str[5];
				str[5]=str[4];
				str[4]=str[6];
				str[6]=t;	
				
			}
			if(sc.charAt(i)=='B'){
				t=str[3];
				str[3]=str[6];
				str[6]=str[4];
				str[4]=str[5];
				str[5]=t;		
				
			}
			if(sc.charAt(i)=='A'){
				t=str[1];
				str[1]=str[4];
				str[4]=str[2];
				str[2]=str[3];
				str[3]=t;
				
			}
			if(sc.charAt(i)=='C'){
				
				t=str[1];
				str[1]=str[3];
				str[3]=str[2];
				str[2]=str[4];
				str[4]=t;				
			}

			
		}
		System.out.println(""+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]);	
	}

}
