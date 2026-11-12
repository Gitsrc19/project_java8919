

class A{
   static int a=10;
   static int b=9;

  void add(){
        System.out.println(a+b);

    }
}
class B extends A {
    void sub() {

        System.out.println(a-b);
    }

}

public class sin_inheritance {
    static void main(String[] args) {
        B b1=new B();
        b1.sub();
        b1.add();
    }
}
