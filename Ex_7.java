import java.util.Scanner;
public class Ex_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String password;
        do{
            System.out.print("Enter password:");
            password=s.nextLine();
        }while(!password.equals("1234"));
         System.out.println("Access Granted!");
    }
    
}
