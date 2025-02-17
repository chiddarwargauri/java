public class StringMethods {
    public static void main(String args[]){
        String s= "Welcome to home";
        String s1="When we enter in the SSGMCE it's feel like our home";
        //=========================== length====================================================
         System.out.println("the length of a String is :" + s.length());
         //==========================Concatinate======================================

         System.out.println("the concATINATE A STRING S AND S1 : " + s + " "+ s1);


         System.out.println(s.concat(s1));
          
         System.out.println("Welcome"+" " +"To my home");
         //=======================toUpperCase==============================================
         String a="welcome";
         System.out.println( a.toUpperCase());
         //=====================toLowerCase=================================================
         String a1="WELCOME";
         System.out.println(  a1.toLowerCase());
         //====================cantain=====================================================
         System.out.println(a.contains("wle"));
         //===================charAT=====================================================
         System.out.println(a.charAt(3));
         //===================substring==================================================
         System.out.println(a.substring(1,3));
         //====================equals()=================================================
         System.out.println( a.equals("welcome"));
         //
         System.out.println( a.equals("Welcome"));
         //===================== equalsIngnoreCase======================================
         System.out.println( a.equalsIgnoreCase("Welcome"));
         

    }
    
}
