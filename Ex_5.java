public /*🔴 Exercise 5: Swap Two Numbers
Write a Java program that declares two integer variables and swaps their values without using a third variable. 
🔴 Method Number2:----------------------> Using Bitwise XOR
*/


class Ex_5 {

    public static void main(String[] args){
        int a=5;
        int b=10;

    System.out.println("Before Swap : a = " +a+ ", b = " +b );

      a=a^b;
      b=a^b;
      a=a^b;

      System.out.println("After swap : a = " +a+ ", b = " +b );

    }
}
