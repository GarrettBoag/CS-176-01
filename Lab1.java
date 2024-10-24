package edu.monmouth.lab1;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		for(int i=15;i<22;i++) {
			if(i%2==0) {System.out.println(i);}}
		
		//Question 2
		String letters;
		String townName = new String("We_st#2!32Lon+98gBr$#90an_ch");
		String result = townName.replaceAll("[^a-zA-Z]", "");
		System.out.println(result);
		
		//Question 3
		String value = new String("XMonmouth UniversityX");
		for(int i=0;i<value.length();i++) {
			if (value.charAt(i) != 'X' && value.charAt(i) != 'y') {
				System.out.println(value.charAt(i));
			}
			else{System.out.print(value.charAt(i));
				}
			}
		
		//Question 4
		int sum = 0;
		for(int i=6;i<15;i++) {
			if(i%2!=0) {
				sum+=i;
			}}
		System.out.println("\n"+sum);
		
		//Question 5
		for(int i=20;i>=4;i--) {
			if(i%4==0) {
				System.out.println(i);
			}
		}
		
		//Question 6
		int sum2 = 0;
		for(int i=1;i<=5;i++) {
			sum2 = i*8;
			System.out.println("8 X "+i+" = "+sum2);
		}
		
		//Question 7
		String value2 = new String("devlos melborp");
		for(int i=13;i>=0;i--) {
			System.out.println(value2.charAt(i));
		}
		
		

	}}


