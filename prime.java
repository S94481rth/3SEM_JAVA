import java.lang.*;
import java.util.Scanner;
class prime{
public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the two numbers (a < b)");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  for(int i = num1 ; i <= num2 ; i++){
     int j=2;
     int flag=1;
     for(j=2;j<i;j++){
       if(i%j == 0)
         {
           flag=0;
           break;
          }
      }

       if(flag == 1){
          System.out.println(" " + i + " ");
           }    
    }
  }
 }



