public class Ex_16_Class {
    int eid;
    String ename;
    int deptno;
    String job;

    void dispaly(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(deptno);
        System.out.println(job);
    }

    public static void main(String args[]){

        Ex_16_Class emp1=new Ex_16_Class();

        emp1.eid=101;
        emp1.ename="Gauri";
        emp1.deptno=10;
        emp1.job="Manager";

        emp1.dispaly();

        Ex_16_Class emp2=new Ex_16_Class();

        emp2.eid=102;
        emp2.ename="pornima";
        emp2.deptno=20;
        emp2.job="Assistence";

        
        emp2.dispaly();
    }

}
