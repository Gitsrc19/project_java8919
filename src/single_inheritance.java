
    interface p1{
        int a=10;
        int b=20;


    }
    interface p2 {
        int c=10;
    }

    class c implements p1,p2{
        void mul()
        {
            System.out.println(a*b*c);
        }
    }
    public class single_inheritance {
    static void main(String[] args) {
    c c1=new c();
    c1.mul();
    }
}
