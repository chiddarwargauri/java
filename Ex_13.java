/* ARRAY
 * 1.DECLEAR
 * 2.INSERT
 * 3.Read
 * 4.Find
 */

public class Ex_13 {
    public static void main(String[] args){
     /* static declaration
     
        int a[] = new int[5];
        a[0]=100;
        a[1]=400;
        a[2]=500;
        a[3]=600;
        a[4]=700;
        System.out.println("At 0th index value is:"+ a[0]);*/


// Dynamic declaration

        int a[]= {100,200,300,400,500};
        System.out.println("The 2nd index value is"+a[2]);

        // if you want accessing a multiple number  by using classic for loop 
        for(int i=0 ; i<a.length;i++){
            System.out.println("the value of array :" +a[i]);

        }

         // or

        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println("the value of array : " + a[i]);
        }

        //by using each for loop or enhance for loop
        for(int i:a){
            System.out.println("array value through enhance for loop: " + i);
        }
        

       
    
}

}
