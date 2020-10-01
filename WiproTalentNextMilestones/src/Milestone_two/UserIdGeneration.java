/*
 * Question:- 
 * I1: String :first name :Rajiv
 * I2: String :last name: roy
 * I3: int :pin code    :560037
 * I4:  int : n          :6
 * 
 * Explain:- 
 * step1: length of LN is less than length of FN.
 * step2: last letter of small name+entire word in the longer name
 * 		  +digit at position of n from left to right +right to left
 * 		  yRajiv75
 * step3: toggle alphabets
 * 			YrAJIV75
 *================================================================
 * I1: String :first name :Manoj
 * I2: String :last name: kumar
 * I3: int :pin code    :561327
 * I4:  int : n          :2
 * 
 * Explain:- 
 * step1: if length of LN is equal to the length of FN then compare k and M.(consider kumar as k is smaller)
 * step2: last letter of small name+entire word in the longer name
 * 		  +digit at position of n from left to right +right to left
 * 		  rManoj62
 * step3: toggle alphabets
 * 		   RmANOJ62
 * ================================================================
 * I1: String :first name :Kumud
 * I2: String :last name: kumar
 * I3: int :pin code    :561327
 * I4:  int : n          :2
 * 
 * Explain:- 
 * step1: if length of LN is equal to the length of FN then compare u and a.(consider kumar as a is smaller than u)
 * step2: last letter of small name+entire word in the longer name
 * 		  +digit at position of n from left to right +right to left
 * 		  rKumud62
 * step3: toggle alphabets
 * 		   RkUMUD62
 * =================================================================
 * if both string totally same.consider any one as small.
 */
package Milestone_two;

import java.util.Scanner;
public class UserIdGeneration {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String Fname=kb.nextLine();
		String lname=kb.nextLine();
		int pin=kb.nextInt();
		int n=kb.nextInt();
		kb.close();
		String small="",longer="";
		if(Fname.length()<lname.length()) {
			small=Fname;
			longer=lname;
		}
		else if(Fname.length()>lname.length()) {
			small=lname;
			longer=Fname;
		}
		else{
			if(Fname.compareTo(lname)<0) {
				longer=lname;
				small=Fname;
			} 
			else if(lname.compareTo(Fname)<0) {
				longer=Fname;
				small=lname;
				
			}
			else {
				longer=lname;
				small=Fname;
			}
		}
		String res="";
		res+=""+small.charAt(small.length()-1)+longer;
		char[] ch=String.valueOf(pin).toCharArray();
		res+=""+ch[n-1]+ch[ch.length-n];
		char [] str=res.toCharArray();
		for(int i=0;i<str.length;i++) {
			if (Character.isUpperCase(str[i])) 
	            str[i] = (char) (str[i] +32); 
	        else if (Character.isLowerCase(str[i])) 
	            str[i] = (char) (str[i] -32); 
		}
		for(char c:str)
			System.out.print(c);	
	}
}
