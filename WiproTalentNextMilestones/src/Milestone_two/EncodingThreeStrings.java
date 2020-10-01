
/*
 * John, Johny, Janardhan
 * 
 */
package Milestone_two;

public class EncodingThreeStrings {
    public static void  encodeThreeStrings(String input1, String input2, String input3) {
    	String f1="",m1="",e1="";
    	String f2="",m2="",e2="";
    	String f3="",m3="",e3="";
    	
    	String output1="",output2="",output3="";
    	int len1=input1.length();
    	int len2=input2.length();
    	int len3=input3.length();
    	
    	
    	//Step 1.
    	if(len1 % 3 ==0) {
    		f1= input1.substring(0,len1/3);
    		m1= input1.substring(len1/3,2*(len1/3));
    		e1= input1.substring(2*(len1/3));
    	}
    	else if((len1-1) % 3 ==0) {
    		f1= input1.substring(0,len1/3);
    		m1= input1.substring(len1/3,2*(len1/3)+1);
    		e1= input1.substring(2*(len1/3)+1);
    	}
    	else if((len1-2) % 3 ==0) {
    		f1= input1.substring(0,(len1/3)+1);
    		m1= input1.substring((len1/3)+1,2*(len1/3)+1);
    		e1= input1.substring(2*(len1/3)+1);
    	}
    	if(len2 % 3 ==0) {
    		f2= input2.substring(0,len2/3);
    		m2= input2.substring(len2/3,2*(len2/3));
    		e2= input2.substring(2*(len2/3));
    	}
    	else if((len2-1) % 3 ==0) {
    		f2= input2.substring(0,len2/3);
    		m2= input2.substring(len2/3,2*(len2/3)+1);
    		e2= input2.substring(2*(len2/3)+1);
    	}
    	else if((len2-2) % 3 ==0) {
    		f2= input2.substring(0,(len2/3)+1);
    		m2= input2.substring((len2/3)+1,2*(len2/3)+1);
    		e2= input2.substring(2*(len2/3)+1);
    	}
    	if(len3 % 3 ==0) {
    		f3= input3.substring(0,len3/3);
    		m3= input3.substring(len3/3,2*(len3/3));
    		e3= input3.substring(2*(len3/3));
    	}
    	else if((len3-1) % 3 ==0) {
    		f3= input3.substring(0,len3/3);
    		m3= input3.substring(len3/3,2*(len3/3)+1);
    		e3= input3.substring(2*(len3/3)+1);
    	}
    	else if((len3-2) % 3 ==0) {
    		f3= input3.substring(0,(len3/3)+1);
    		m3= input3.substring((len3/3)+1,2*(len3/3)+1);
    		e3= input3.substring(2*(len3/3)+1);
    	}
    	
    	//step 2.
    	output1=f1+f2+f3;
    	output2=m1+m2+m3;
    	output3=e1+e2+e3;
    	
    	//step 3.
    	String res="";
    	for(int i=0; i<output3.length(); i++) {
    		Character c=output3.charAt(i);
    		if(Character.isUpperCase(c)) {
    			res = res+ (""+output3.charAt(i)).toLowerCase();
    		}
    		else {
    			res = res+ (""+output3.charAt(i)).toUpperCase();
    		}
    	}
    	//use this commented only in mettl platform and comment below print lines.
    	//Result rs=new Result(output1,output2,res);
    	//return rs;
    	System.out.println(output1);
    	System.out.println(output2);
    	System.out.println(res);
    }
	public static void main(String[] args) {
		encodeThreeStrings("John","Johny","Janardhan");
	}
}
