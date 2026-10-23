public class varargs {
    static int add(int ... num) {
        int total = 0;
        for (int n : num) {
            total = total + n;
        }
        return total;
    }
    static void main(String[] args){
     System.out.println(add(90,20));
     System.out.println(add(20,80,55));
    }
}
