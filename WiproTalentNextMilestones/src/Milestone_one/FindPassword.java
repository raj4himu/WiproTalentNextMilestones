/*
 * 
 * Stable  = (stable are those each of whose digit occur same no of times.)
 * Unstable = (Unstable are those each of whose digit doesn't occur same no of times.)
 * --->>> sum of stables - sum of unstables
 */

package Milestone_one;

public class FindPassword {
	static int diffrence(int input1,int input2,int input3,int input4,int input5){
		  
		   int[] arr= {input1,input2,input3,input4,input5};
		   int[] index=new int[10];
		    int stable=0,unstable=0;
		   
		    for(int i=0;i<5;i++) {
		     int temp=arr[i]; //System.out.println("arr[0] = "+arr[i]);
		     
		     for(int i1=0;i1<10;i1++) {
		      index[i1]=0;
		     }
		     
		     while(arr[i]>0) {
		      index[arr[i]%10]++;// System.out.println(arr[i]%10);
		      arr[i]=arr[i]/10; 
		     }
		     int greatnum=0;
		     for(int z=0;z<10;z++) {
		      if(index[z]>greatnum) {
		       greatnum=index[z];  // System.out.println(greatnum);
		      }
		     }
		   
		     int flag=0;
		     for(int x=0;x<10;x++) {
		      if(index[x]!=greatnum && index[x]!=0) {  
		       flag=1;  //System.out.println(flag);        
		       break;
		      }
		     }

		     if(flag==1) {
		      unstable+=temp; //sum of all unstables
		     }
		     else stable+=temp; // sum of all stables
		    }
		  return Math.abs(stable-unstable); //sum of stables - sumof unstables.
		 }

	public static void main(String[] args) {
		int a=diffrence(12,1313,122,678,898);
		System.out.println(a);
	}
}
