/*
 * FindKey:-(3521,1352,2452)
 * [max(digits at thousands place)- min(digits at thousands place)]
 * [max(digits at hundreds place)- min(digits at hundreds place)]
 * [max(digits at tens place)- min(digits at tens place)]
 * [max(digits at ones place)- min(digits at ones place)]
 * --------->[3-1][5-3][5-2][2-1]---->> 2231.
 * 
 */

package Milestone_one;

public class FindKey {
    public static int findKey(int input1,int input2, int input3) {
    	int max,min;
    	StringBuffer res=new StringBuffer();
    	while(input1 !=0 && input2!=0 && input3!=0) {
    		int a=input1 % 10;
    		int b=input2 % 10;
    		int c=input3 % 10;
    		
    	    max=Math.max((Math.max(a, b)), c);
    	    min=Math.min((Math.min(a, b)), c);
    	    
    	    res.append((max-min));
    	    input1 /= 10;
    	    input2 /= 10;
    	    input3 /= 10;
    	    max=0;
    	    min=0;
    	}
    	res=res.reverse();
    	String result = new String(res);
    	return Integer.parseInt(result);
    }
	public static void main(String[] args) {
		System.out.println(findKey(3521,1352,2452));
	}
}
