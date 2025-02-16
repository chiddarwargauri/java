import java.util.Scanner;
public class Ex_12{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Enter number to check it even or odd :");
        num1=sc.nextInt();
        if(num1%2==0){
            System.out.println("number is even ");

        }
        else {
            System.out.println("number is odd");
        }
    }
}