import java.lang.*;
import java.util.Scanner; 
class Main{
    String name;
    String author;
    double price;
    int pages;
    Main(){
    name = "";
    author = "";
    price = 0 ;
    pages =0;
    }
    
    void accept(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the book ::  ");
        name = obj.nextLine();
        System.out.println("Enter the name of the author ::  ");
        author = obj.nextLine();
        System.out.println("Enter the price of the book ::  ");
        price = obj.nextInt();
        System.out.println("Enter the number of pages ::  ");
        pages = obj.nextInt();
    }
    
    public String toString(){
        return "\n name of book is " + name + "\n Name of author is :: " +author+ "\n Price OF book is "+ price   + "\n number of pages is " + pages + "\n";   
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of books :: ");
        int number_of_books = obj.nextInt();
        Main book[] = new Main[number_of_books];
        for(int i=0;i<number_of_books;i++){
            book[i] = new Main();
            book[i].accept();
        }
        for(int i=0;i<number_of_books;i++){
            System.out.println(book[i]);
        }
        double largest = book[0].price;
        int index = 0;
        for(int i=0;i<number_of_books;i++){
            if(largest < book[i].price){
                largest = book[i].price;
                index = i;
            }
        }
        System.out.println("Details of book with higest price is given :: ");
        System.out.println(book[index]);
    }
}
