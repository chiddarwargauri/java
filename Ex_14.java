/*Two Dimentional Array */
/*
 * declaration 
 */
public class Ex_14{
    public static void main(String[] args){
        // static declaration
        // first [] is for row & second [] is for colomn
        int a[][] = new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;
    System.out.println("size of array row" +a.length );
    System.out.println("size of array of the column:" + a[0].length);

    //dynamic allocation

    int b[][]={{100,200,300},{400,500,600},{700,800,900}};
    System.out.println("the size of row is :" + b.length);
    System.out.println("the size of column : "+b[0].length);
    
// classic foor loop
    for(int i=0;i<b.length;i++)//row
    {
        for(int j=0;j<b[i].length;j++)//column
        {
            System.out.println("the values in array:"+b[i][j]);
        }
    
    }
// Enhance for loop

for(int r[]:b) 
{
    for(int i:r){
        System.out.print(i+"");

    }
    System.out.println();

}

    }
}