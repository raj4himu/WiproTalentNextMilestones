/*
 * RObot moving M- 2 step, m- 1 Step, R-90 deg. right, r- 45 deg. right, L- 90 deg. left
 * l- 45 deg. left    (directions- N S E W NE NW SE SW)
 * 
 */
package Milestone_three;

import java.util.Scanner;

public class RobotQuestion {
	public static void main(String[] args) {
	    Scanner kb=new Scanner(System.in);
     int input1=kb.nextInt();
     int input2=kb.nextInt();
     kb.nextLine();
     String input3=kb.nextLine();
     String input4=kb.nextLine();
     kb.close();
     
     int i1=input1;
     int i2=input2;
     String [] pos=input3.split("-");
     String [] mov=input4.split(" ");
     String res="";
     int temp=0;
     for(int i=0; i<mov.length; i++){
     	//Now R -> 90 degrees right turn.
         if(mov[i].equals("R")){
              if(pos[2].equals("E")){
                 pos[2]="S";
              }
              else if(pos[2].equals("W")){
                 pos[2]="N";
              }
              else if(pos[2].equals("N")){
                 pos[2]="E";
              }
              else if(pos[2].equals("S")){
                 pos[2]="W";
              }
              else if(pos[2].equals("NE")){
                  pos[2]="SE";
               }
               else if(pos[2].equals("NW")){
                  pos[2]="NE";
               }
               else if(pos[2].equals("SE")){
                  pos[2]="SW";
               }
               else if(pos[2].equals("SW")){
                  pos[2]="NW";
               }
         }
         //Now r -> 45 degrees right turn.
         if(mov[i].equals("r")){
             if(pos[2].equals("E")){
                pos[2]="SE";
             }
             else if(pos[2].equals("W")){
                pos[2]="NW";
             }
             else if(pos[2].equals("N")){
                pos[2]="NE";
             }
             else if(pos[2].equals("S")){
                pos[2]="SW";
             }
             else if(pos[2].equals("NE")){
                 pos[2]="E";
              }
              else if(pos[2].equals("NW")){
                 pos[2]="N";
              }
              else if(pos[2].equals("SE")){
                 pos[2]="S";
              }
              else if(pos[2].equals("SW")){
                 pos[2]="W";
              }
        }
       //Now L -> 90 degrees left turn.
         else if(mov[i].equals("L")){
              if(pos[2].equals("E")){
                 pos[2]="N";
              }
              else if(pos[2].equals("W")){
                 pos[2]="S";
              }
              else if(pos[2].equals("N")){
                 pos[2]="W";
              }
              else if(pos[2].equals("S")){
                 pos[2]="E";
              }
              else if(pos[2].equals("NE")){
                  pos[2]="NW";
               }
               else if(pos[2].equals("NW")){
                  pos[2]="SW";
               }
               else if(pos[2].equals("SE")){
                  pos[2]="NE";
               }
               else if(pos[2].equals("SW")){
                  pos[2]="SE";
               }
         }
       //Now l -> 45 degrees left turn.
         else if(mov[i].equals("l")){
             if(pos[2].equals("E")){
                pos[2]="NE";
             }
             else if(pos[2].equals("W")){
                pos[2]="SW";
             }
             else if(pos[2].equals("N")){
                pos[2]="NW";
             }
             else if(pos[2].equals("S")){
                pos[2]="SE";
             }
             else if(pos[2].equals("NE")){
                 pos[2]="N";
              }
              else if(pos[2].equals("NW")){
                 pos[2]="W";
              }
              else if(pos[2].equals("SE")){
                 pos[2]="E";
              }
              else if(pos[2].equals("SW")){
                 pos[2]="S";
              }
        }
       //Now M -> 2 unit forward move.
         else if(mov[i].equals("M")){
              if(pos[2].equals("E")){
                  int d=Integer.parseInt(pos[0]);
                  if((d+1) < i1){
                      d += 2;
                      pos[0]=String.valueOf(d);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              else if(pos[2].equals("W")){
                 int d=Integer.parseInt(pos[0]);
                  if(d > 1){
                      d -= 2;
                      pos[0]=String.valueOf(d);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              else if(pos[2].equals("N")){
                  int d=Integer.parseInt(pos[1]);
                  if((d+1) < i2){
                      d += 2;
                      pos[1]=String.valueOf(d);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              else if(pos[2].equals("S")){
                  int d=Integer.parseInt(pos[1]);
                  if(d > 1){
                      d -= 2;
                      pos[1] = String.valueOf(d);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              if(pos[2].equals("NE")){
                  int x=Integer.parseInt(pos[0]);
                  int y=Integer.parseInt(pos[1]);
                  if((y+1) < i2 && (x+1) < i1){
                      x += 2;
                      y += 2;
                      pos[0]=String.valueOf(x);
                      pos[1]=String.valueOf(y);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              if(pos[2].equals("NW")){
                  int x=Integer.parseInt(pos[0]);
                  int y=Integer.parseInt(pos[1]);
                  if((y+1) < i2 && x>1){
                      x -= 2;
                      y += 2;
                      pos[0]=String.valueOf(x);
                      pos[1]=String.valueOf(y);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              if(pos[2].equals("SE")){
                  int x=Integer.parseInt(pos[0]);
                  int y=Integer.parseInt(pos[1]);
                  if(y > 1 && (x+1)<i1){
                      x += 2;
                      y -= 2;
                      pos[0]=String.valueOf(x);
                      pos[1]=String.valueOf(y);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
              if(pos[2].equals("SW")){
                  int x=Integer.parseInt(pos[0]);
                  int y=Integer.parseInt(pos[1]);
                  if(y > 1 && x > 1){
                      x -= 2;
                      y -= 2;
                      pos[0]=String.valueOf(x);
                      pos[1]=String.valueOf(y);
                  }
                  else{
                      temp = 1;
                      break;
                  }
              }
         }
       //Now m -> 1 unit forward move.
         else if(mov[i].equals("m")){
             if(pos[2].equals("E")){
                 int d=Integer.parseInt(pos[0]);
                 if(d < i1){
                     d += 1;
                     pos[0]=String.valueOf(d);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             else if(pos[2].equals("W")){
                int d=Integer.parseInt(pos[0]);
                 if(d > 0){
                     d -= 1;
                     pos[0]=String.valueOf(d);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             else if(pos[2].equals("N")){
                 int d=Integer.parseInt(pos[1]);
                 if(d < i2){
                     d += 1;
                     pos[1]=String.valueOf(d);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             else if(pos[2].equals("S")){
                 int d=Integer.parseInt(pos[1]);
                 if(d > 0){
                     d -= 1;
                     pos[1] = String.valueOf(d);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             if(pos[2].equals("NE")){
                 int x=Integer.parseInt(pos[0]);
                 int y=Integer.parseInt(pos[1]);
                 if(y < i2 && x < i1){
                     x += 1;
                     y += 1;
                     pos[0]=String.valueOf(x);
                     pos[1]=String.valueOf(y);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             if(pos[2].equals("NW")){
                 int x=Integer.parseInt(pos[0]);
                 int y=Integer.parseInt(pos[1]);
                 if(y < i2 && x>0){
                     x -= 1;
                     y += 1;
                     pos[0]=String.valueOf(x);
                     pos[1]=String.valueOf(y);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             if(pos[2].equals("SE")){
                 int x=Integer.parseInt(pos[0]);
                 int y=Integer.parseInt(pos[1]);
                 if(y > 0 && x<i1){
                     x += 1;
                     y -= 1;
                     pos[0]=String.valueOf(x);
                     pos[1]=String.valueOf(y);
                 }
                 else{
                     temp = 1;
                     break;
                 }
             }
             if(pos[2].equals("SW")){
                 int x=Integer.parseInt(pos[0]);
                 int y=Integer.parseInt(pos[1]);
                 if(y > 0 && x > 0){
                     x -= 1;
                     y -= 1;
                     pos[0]=String.valueOf(x);
                     pos[1]=String.valueOf(y);
                 }
                 else{
                     temp = 1;
                     break;
                 }} 
        }}
     res=res + pos[0];
     for(int i=1; i<3; i++){
         res = res + "-" + pos[i];
     }
     if(temp == 1){
         res = res + "-ER";
     }
     System.out.print(res);
}
}
