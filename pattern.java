import java.lang.*;
import java.util.Scanner;
class pattern {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number ");
      int number = input.nextInt();
      int i =0,sum=1;  
      for(i=0; i<number ; i++){
         int j=0;
         for(j=0 ; j <= i; j++) {
              System.out.print(" " +sum+" " );
              sum++;
             } 
                  System.out.println("");
           }
   }
}
