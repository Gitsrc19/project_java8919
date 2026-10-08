package Daywise_class_notes;

public class arrays_prg {
    static void main(String[] args) {
        String [] stu_name={"nafi","safi","zaina"};
        System.out.println(stu_name[1]);

        int [] a={2,3,1,4,56,78,98,65,43,23,12};
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
System.out.println("**************************");
        for(String i:stu_name){
            System.out.println(i);

        }

    }
}
