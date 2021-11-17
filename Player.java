import java.util.Scanner; 
public class Main{
    int id, scores[], no_matches_played;
    String name;
    double average;
    Main(){
        id = 0;
        no_matches_played = 0;
        average = 0 ;
        name = " ";
    }
    void accept(){
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter name :: ");
        name = in.nextLine(); 
        System.out.println("Enter id :: ");
        id = in.nextInt();
        System.out.println("Enter number of matches played :: ");
        no_matches_played = in.nextInt();
        System.out.println("Enter Scores :: ");
        scores = new int[no_matches_played];
        for(i=0;i<no_matches_played;i++){
            System.out.println("Match - " + (i+1) );
            scores[i] = in.nextInt();
        }
    }
    
    double calculate(){
        int total = 0,i=0;
        for(i=0;i<no_matches_played;i++){
            total = total + scores[i];
        }
        average = total / no_matches_played;
        return average;
    }
    void display(){
         int i=0;
         System.out.println("Player Informations :: ");
         System.out.println("Player's name :: " + name);
         System.out.println("Player's id :: " + id);
         System.out.println("Player's average :: " + average);
         System.out.println("Number of matches played :: " + no_matches_played );
         System.out.println("Scores :: ");
         for(i=0;i<no_matches_played;i++){
             System.out.print(scores[i] + "  ");
         }
    }
    
    public static void main(String args[]){
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of players :: ");
        int num = in.nextInt();
        Main myBoys[] = new Main[num];
        for(i=0;i<num;i++){
            myBoys[i] = new Main();
            myBoys[i].accept();
            myBoys[i].calculate();
            myBoys[i].display();
        }
        double highest = myBoys[0].average;
        int index = 0;
        for(i=0;i<num;i++){
            if(highest < myBoys[i].average){
                highest = myBoys[i].average;
                index = i;
            }
        }
        System.out.println();
        System.out.println("Details of player with highest average :: ");
        myBoys[index].display();
    }
}
