class  call{
    int a=90;
    int b=20;
    static int c=89;
    void add()
    {
        System.out.println(a+b);
    }
    void sub()
    {
        System.out.println(a-b);
    }
    void div(){
        System.out.println(a/b);
    }

     }


public class cal_prg {
    static void main(String[] args) {
        call obj = new call();
        obj.add();
        obj.sub();
        obj.div();
        System.out.println(obj.c);
    }
}