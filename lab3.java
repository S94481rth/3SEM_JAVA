import java.util.Scanner;
import java.lang.*;
class lab3{
    int price;
    int num_pages;
    String name;
    String author;
    lab3() {
      int price =0;
      int num_pages=0;
      String name;
      String author;   
    }
    void accept(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the price and number of pages :  ");
        price = obj.nextInt();
        num_pages = obj.nextInt();
        System.out.println("Enter book and author:   ");
        name = obj.next();
        author = obj.next();
    }
    void display(){
        System.out.println("The price of the book is : " + price + " and the number of pages are : " + num_pages);
        System.out.println("The name of the book is : " + name + " and the name of author is : " + author+"\n");
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int num_books = obj.nextInt();
        lab3 book[] = new lab3[num_books];
        for(int i=0;i<num_books;i++){
            book[i] = new lab3();
            book[i].accept();
        }
        for(int i=0;i<num_books;i++){
        book[i].display();
        }
        int large = book[0].price,index = 0 ;
        for(int i=0;i<num_books;i++){
            if(large < book[i].price){
                large = book[i].price;
                index = i;
            }
        }
        System.out.println("\nThe details of book with hightest price is : ");
        book[index].display();
    }
}