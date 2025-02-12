public class Ex_3 {
    public static void main(String[] args){
        if(args.length>0){
            System.out.print("Hello ");
            for(int i=0;i<args.length;i++){
                System.out.println(args[i]+" ");
            }
            System.out.println("..!!! ");
        }
       else{
        System.out.println("No argument provided in the commad line.....!!!");
       }
}
}

