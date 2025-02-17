//how we reverse a string

public class String_EX1 {
    public static void main(String[] args){
        String a="Gauri";
        int l= a.length();//8-1
        String rev="";
        for(int i=l-1;i>=0;i--)//7,6,5,4,3,2,1,0
        {
          rev=rev +  a.charAt(i);//iruaG

        }
        System.out.println("Reverse String is :"+rev);
    }

    
}
