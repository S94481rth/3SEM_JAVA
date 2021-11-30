import java.lang.*;
import java.util.Scanner;
class Main{
    String usn;
    String name;
    double sgpa;
    int[] credits,scores;
    int number_of_subjects;
    
    
    void accept(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter usn :: ");
        usn = obj.nextLine();
        System.out.println("Enter name :: ");
        name = obj.nextLine();
        System.out.println("Enter the number of subjects :: ");
        number_of_subjects = obj.nextInt();
        System.out.println("Enter scores and corresponding credits :: ");
        credits = new int[number_of_subjects];
        scores = new int[number_of_subjects];
        for(int i=0; i < number_of_subjects ; i++ ){
            System.out.println("Score of Subject" + (i+1));
            scores[i] = obj.nextInt();
            System.out.println("Credits for Subject" + (i+1));
            credits[i] = obj.nextInt();
        }
        
    }
        
    void calculate(){
        double total_prod=0, total_credits = 0;
        for(int i=0;i<number_of_subjects;i++){
            total_credits = credits[i] + total_credits;
            total_prod = total_prod + credits[i]*scores[i];
        }
        double sgpa = total_prod / total_credits; 
        System.out.println(total_credits + " "+ total_prod + "  " + sgpa);
    }
    
    void display(){
        System.out.println("Name :: " + name);
        System.out.println("USN :: " + usn);
        System.out.println("Scores :: "  );
        for(int i=0;i<number_of_subjects;i++){
        System.out.print(" " + scores[i] +" "  );
        }
        System.out.println(" ");
        System.out.println("The SGPA of the student is :: " + sgpa);
    }
    public static void main(String args[]){
        Main student1 = new Main();
        student1.accept();
        student1.calculate();
        student1.display();
    }
}
