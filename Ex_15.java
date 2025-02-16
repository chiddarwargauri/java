public class Ex_15 {
    // serch elementin array
    public static void main(String[] args){

      int num=50;
      boolean flag=false; //temp variable use
        int[] a={10,20,30,40,50};
        for(int i:a){
            
            if(i==num){
                System.out.println("Element found");
                 flag=true;
                break;
            } 
        }
        if(flag==false){
        System.out.println("Element not found");
    }
    }
}
