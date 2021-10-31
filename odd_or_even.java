import java.lang.*;
import java.util.Scanner; 
class odd_or_even{
  public static void main(String args[]){
   int num;
   Scanner scanobj = new Scanner(System.in);
   System.out.print("Enter an integer: ");
   num = scanobj.nextInt();
   if(num % 2 == 0){
     System.out.println("entered number is even..");
}
   else{
          System.out.println("entered number is odd..");
   }
  }
}






