import java.lang.Math;
import java.util.Scanner;
public class quadratic {
  public static void main(String args[]){
      int a,b,c;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the coefficients of a,b,c :: ");
      a = obj.nextInt();
      b = obj.nextInt();
      c = obj.nextInt();
      int d = b*b - 4*a*c;
      if(d == 0){
          double root = -b/2*a;
          System.out.println("The roots are equal and are equal to ::  " + root);
      }
      else if(d > 0){
          double sqrt_d = Math.sqrt(d);
          double root1 = (sqrt_d - b)/2*a;
          double root2 = (-sqrt_d - b)/2*a;
          System.out.println("The roots are :: " + root1 + " and  :: " + root2); 
      }
      else if(d<0){
        double sqrt_d = Math.sqrt(-d);
        double real_part = (double)b/2*a*(-1);
        double imag_term = sqrt_d/2*a;
        System.out.println("The root1 is  :: " + real_part + "+ i*"+ imag_term);
        System.out.println("The root2 is  :: " + real_part + "- i*"+ imag_term); 
      }
    }   
}
