import java.lang.*;
import java.util.Scanner;
class grade {
 public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int i=0;
    int cie[] = new int[6]; 
    int see[] = new int[6]; 
    int total[] = new int[6]; 
    System.out.println("Enter the number of subjects: ");
    int num_sub = input.nextInt();
    for(i=0;i<num_sub;i++)
      {  
        System.out.println("Enter cie: ");
        cie[i] = input.nextInt();
        System.out.println("Enter see: ");
        see[i] = input.nextInt(); 
       } 
    for(int j=0; j< num_sub; j++)
      {
         total[j] = cie[j] + (see[j]/2);
         if(total[j] >= 90 ) {
              System.out.println("S grade");
                }
         if(total[j] >= 80 && total[j]< 90 ) {
              System.out.println("A grade");
                }
         if(total[j] >= 70 && total[j]< 80 ) {
              System.out.println("B grade");
                }     
         if(total[j] >= 60 && total[j]< 70 ) {
              System.out.println("C grade");
                }
         if(total[j] >= 50 && total[j]< 60 ) {
              System.out.println("D grade");
                } 
         if(total[j] >= 40 && total[j]< 50 ) {
              System.out.println("E grade");
                } 
        }
   }
}





