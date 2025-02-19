/*
 * 1️⃣ Create a Book class with attributes: title, author, price. Add a constructor and a method to display details.
 */

public class Ex_17 {
    String title;
    int price;
    String author;

    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String args[]){
        Ex_17 b1=new Ex_17();
        b1.title="Ready steady Go";
        b1.author="dipak mehara";
        b1.price=40;
        b1.display();
        
    }
    
}
