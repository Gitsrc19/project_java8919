public class calling_method {

    static int add(int a,int b){
        return a+b;
    }

    static void main(String[] args) {
        int c=calling_method.add(54,67);
        System.out.println(c);
    }
}
