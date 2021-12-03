import java.lang.*;
import java.util.Scanner;

class Main{
    String usn;
    String name;
    int[] credits,scores;
    int number_of_subjects;
    double sgpa;
    void accept(){
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter name:: ");
        name = obj.nextLine();
        System.out.println("Enter USN:: ");
        usn = obj.nextLine();
        System.out.println("Enter number of subjects :: ");
        number_of_subjects = obj.nextInt();
        credits = new int[number_of_subjects];
        scores = new int[number_of_subjects];
        System.out.println("Enter marks and corresponding credits ::  ");
        for(int i=0;i<number_of_subjects;i++){
            System.out.println("subject-" +(i+1));
            scores[i] = obj.nextInt();
            System.out.println("credits-" +(i+1));
            credits[i] = obj.nextInt();
        }
    }
    void calculate(){
        double total_credits=0,total_prod=0;
        for(int i=0;i<number_of_subjects;i++){
            total_prod = total_prod + scores[i]*credits[i];
            total_credits = total_credits + credits[i];
        }
        double sgpa = total_prod / total_credits;
        display(sgpa);
    }
    void display(double sgpa){
        System.out.println("Name :: " + name);
        System.out.println("USN :: " + usn);
        System.out.println("Scores :: "  );
        for(int i=0;i<number_of_subjects;i++){
            System.out.print("subject-"+(i+1)+" :: " + scores[i]);
        }
        System.out.println(" ");
        System.out.println("GPA of the student is ::  "+ sgpa);
    }
    public static void main(String args[]){
        Main student1 = new Main();
        student1.accept();
        student1.calculate();
    } 
}
