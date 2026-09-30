package Daywise_class_notes;

public class static_prg {
    static int a=15;//static var
    int a1=34;// non-static
    int b=21;
    public static void main(String[] args){
        System.out.println(static_prg.a);
      static_prg obj1=new static_prg();
      System.out.println(obj1.a1);
      System.out.println(obj1.b);
    }

}
