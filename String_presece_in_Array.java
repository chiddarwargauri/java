public class String_presece_in_Array {
    public static void main(String[] args){

        String[] s={"gauri","prakash","chiddarwar"};
        String check="gauri";
        boolean flag= false;

        for (String i:s){
            if(i.equals(check)){
                System.out.println("String found in array");
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("String not found");
        }
        
        
    }
    
}
