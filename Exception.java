import java.util.Scanner;
class NegetiveAgeException extends Exception{
    NegetiveAgeException(){
        super();
    }
    
    String disclaimer1(){
        return "Age cannot be negetive";
    }
}

class FatherYoungerThanSonException extends Exception{
    FatherYoungerThanSonException(){
        super();
    }
    String disclaimer2(){
        return "Father should be older than Son";
    }
}

public class Main{
    
    static void checkAge(int F_Age, int S_Age) throws NegetiveAgeException,FatherYoungerThanSonException{
        if(F_Age < 0 || S_Age < 0){
            throw new NegetiveAgeException();
        }
        if(F_Age < S_Age){
            throw new FatherYoungerThanSonException();
        }
    }
    
    
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter father's age :: ");
        int fatherAge = obj.nextInt();
        System.out.println("Enter son's age :: ");
        int sonAge = obj.nextInt();
        try{
           checkAge(fatherAge, sonAge); 
        }
        catch(NegetiveAgeException e){
            System.out.println(e.disclaimer1());
        }
        catch(FatherYoungerThanSonException e){
            System.out.println(e.disclaimer2());
        }
    }
}
