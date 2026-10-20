public class Overloading_prg {
    static boolean status(int actual){
        return actual==200;
    }
    static boolean status(int actual,int expected){
        return actual==expected;
    }
    static void main (String args[]){
       boolean c= status(500);
        boolean d= status(200,200);
        System.out.println("Status"+" " +c);
        System.out.println("status"+ " "+d);
    }
}
