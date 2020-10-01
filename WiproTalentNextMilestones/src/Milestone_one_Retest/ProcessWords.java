/*
 * Process two words.
 * input1 --> "Today is a Nice Day";
 * input2 --> 41; // it means expectec to process 4th and 1st words.
 * The processing of each word to be done as discussed below:-
 * 1.EXTRACT THE "MIDDLE-TO-END-PART"     //"ce","day"
 * 2.EXTRACT THE "MIDDLE-TO-BEGIN-PART"   //"iN","doT"
 * ans--String res=first_word_1+input_word_1+" "+second_word_1+input_word_2;---------->ceiN daydoT
 */

package Milestone_one_Retest;

public class ProcessWords {
    public static String processWords(String input1, int input2) { // Today is a Nice Day , 41
    	  int second_number=input2%10;//1
    	  input2/=10;//4 
    	  int first_number=input2;
    	  String[] arr=input1.split(" ");
    	  String first_word=arr[first_number-1];//Nice
    	  String second_word=arr[second_number-1];//Today
    	  String first_word_1=first_word.substring(first_word.length()/2,first_word.length());//ce substrg(2,4)
    	  String first_word_2;
    	  if(first_word.length()%2==0)
    	  {
    	      first_word_2=first_word.substring(0,first_word.length()/2); //Ni 
    	  }
    	  else
    	  {
    	      first_word_2=first_word.substring(0,first_word.length()/2+1);
    	  }
    	  StringBuilder input_word_1=new StringBuilder();
    	  input_word_1.append(first_word_2);//Ni
    	  input_word_1=input_word_1.reverse();//iN
    	  String second_word_1=second_word.substring(second_word.length()/2,second_word.length());
    	  String second_word_2;
    	  if(second_word.length()%2==0)
    	  {
    	      second_word_2=second_word.substring(0,second_word.length()/2);
    	  }
    	  else
    	  {
    	      second_word_2=second_word.substring(0,second_word.length()/2+1);//Tod
    	  }
    	  StringBuilder input_word_2=new StringBuilder();
    	  input_word_2.append(second_word_2);
    	  input_word_2=input_word_2.reverse();
    	  
    	  String res=first_word_1+input_word_1+" "+second_word_1+input_word_2;
    	  return res;
    }
	public static void main(String[] args) {
		String a="Today is a Nice Day";
		int b=41;
		System.out.println(processWords(a,b));
	}
}
