package Milestone_one_Retest;
/*
 * 
 * Two unit - subtraxted form.
 * One unit - subtracted form -->> use while(input1>=10)
 * 6928-------[|(6-9)|  |(9-2)|   |(2-8)|]------>376-----[|(3-7)|  |(7-6)|]---->41(two unit s-form)----[|(4-1)|]----->3(one unit s-form)
 */
import java.util.*;
public class SubtractedForm {
	public static int reduce(int input1) {
		while(input1>=10) {
			int x=input1;
			int l=0;
			while(input1>0) {
				input1 /= 10;
				l++;
			}
			int [] a=new int[l];
			int i=l-1;
			while(x>0) {
				a[i]=x%10;
				x /= 10;
				i--;
			}
			for(int j=0; j<l-1; j++) {
				input1 = input1*10 + Math.abs(a[j]-a[j+1]);
			}
		}
		return input1;
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		kb.close();
		System.out.println(reduce(a));
	}
}
